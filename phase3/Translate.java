package p3;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Translate {
	
	protected ArrayList<String> mips;
	protected ArrayList<Instruction> ori;
	protected HashMap<FunctLabel, EndFunct> size;
	
	public Translate(ArrayList<Instruction> IR) {
		ori = IR;
		mips = new ArrayList<>();
		size = new HashMap<>();
		InsLabel temp = null;
		for (Instruction i : ori) {
			if (i instanceof InsLabel) {
				if (((InsLabel) i).label1 != null) {
					temp = (InsLabel) i;
				}
			}
			if (i instanceof EndFunct) {
				EndFunct a = (EndFunct) i;
				size.put(temp.label1, a);
			}
		}
	}
	
	public void naiveTranslate(Instruction a) {
		if (a instanceof Binary) {
			Binary curr = (Binary) a;
			if (!(curr.operand1.isFloat || curr.operand2.isFloat || curr.operand3.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand1.mips());
				mips.add("\tlw $t1, " + curr.operand2.mips());
				mips.add("\t" + curr.mipsOp() + " $t0, $t0, $t1");
				mips.add("\tsw $t0, " + curr.operand3.mips());
			} else {
				mips.add("\tl.s $f2, " + curr.operand1.mips());
				/*if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f2, $f2");
				}*/
				mips.add("\tl.s $f3, " + curr.operand2.mips());
				/*if (!curr.operand2.isFloat) {
					mips.add("\tcvt.s.w $f3, $f3");
				}*/
				mips.add("\t" + curr.mipsOp() + " $f2, $f2, $f3");
				mips.add("\ts.s $f2, " + curr.operand3.mips());
			}
		} else if (a instanceof BinaryImm) { 
			BinaryImm curr = (BinaryImm) a;
			if (!(curr.isFloat || curr.operand1.isFloat || curr.operand4.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand1.mips());
				mips.add("\tli $t1, " + curr.operand2);
				if (!curr.ifswitch) {
					mips.add("\t" + curr.mipsOp() + " $t0, $t0, $t1");
				} else {
					mips.add("\t" + curr.mipsOp() + " $t0, $t1, $t0");
				}
				mips.add("\tsw $t0, " + curr.operand4.mips());
			} else if (curr.isFloat) {
				mips.add("\tl.s $f2, " + curr.operand1.mips());
				/*if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f2, $f2");
				}*/
				mips.add("\tli.s $f3, " + curr.operand3);
				if (!curr.ifswitch) {
					mips.add("\t" + curr.mipsOp() + " $f2, $f2, $f3");
				} else {
					mips.add("\t" + curr.mipsOp() + " $f2, $f3, $f2");
				}
				mips.add("\ts.s $f2, " + curr.operand4.mips());
			} else {
				mips.add("\tl.s $f2, " + curr.operand1.mips());
				/*if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f2, $f2");
				}*/
				mips.add("\tli.s $f3, " + curr.operand2);
				/*mips.add("\tcvt.s.w $f3, $f3");*/
				if (!curr.ifswitch) {
					mips.add("\t" + curr.mipsOp() + " $f2, $f2, $f3");
				} else {
					mips.add("\t" + curr.mipsOp() + " $f2, $f3, $f2");
				}
				mips.add("\ts.s $f2, " + curr.operand4.mips());
			}
		} else if (a instanceof BinaryTwoImm) {
			BinaryTwoImm curr = (BinaryTwoImm) a;
			if (!(curr.isFloat || curr.operand3.isFloat)) {
				mips.add("\tli $t0, " + curr.operand1);
				mips.add("\tli $t1, " + curr.operand2);
				mips.add("\t" + curr.mipsOp() + " $t0, $t0, $t1");
				mips.add("\tsw $t0, " + curr.operand3.mips());
			} else {
				mips.add("\tli.s $f2, " + curr.operand4);
				mips.add("\tli.s $f3, " + curr.operand5);
				mips.add("\t" + curr.mipsOp() + " $f2, $f2, $f3");
				mips.add("\ts.s $f2, " + curr.operand3.mips());
			}
		} else if (a instanceof Assignment) {
			Assignment curr = (Assignment) a;
			if (!(curr.operand2.isFloat || curr.operand1.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand2.mips());
				mips.add("\tsw $t0, " + curr.operand1.mips());
			} else {
				mips.add("\tl.s $f2, " + curr.operand2.mips());
				/*if (!curr.operand2.isFloat) {
					mips.add("\tcvt.s.w $f2, $f2");
				}*/
				mips.add("\ts.s $f2, " + curr.operand1.mips());
			}
		} else if (a instanceof AssignImm) {
			AssignImm curr = (AssignImm) a;
			if (!(curr.isFloat || curr.operand1.isFloat)) {
				mips.add("\tli $t0, " + curr.operand2);
				mips.add("\tsw $t0, " + curr.operand1.mips());
			} else if (curr.isFloat) {
				mips.add("\tli.s $f2, " + curr.operand3);
				mips.add("\ts.s $f2, " + curr.operand1.mips());
			} else {
				mips.add("\tli.s $f2, " + curr.operand2);
				/*mips.add("\tcvt.s.w $f2, $f2");*/
				mips.add("\ts.s $f2, " + curr.operand1.mips());
			}
		} else if (a instanceof Goto) {
			Goto curr = (Goto) a;
			mips.add("\tj, " + curr.label);
		} else if (a instanceof Branch) {
			Branch curr = (Branch) a;
			if (!(curr.operand1.isFloat || curr.operand2.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand1.mips());
				mips.add("\tlw $t1, " + curr.operand2.mips());
				mips.add("\t" + curr.mipsOp() + " $t0, $t1, " +curr.label);
			} else {
				mips.add("\tl.s $f2, " + curr.operand1.mips());
				if (!curr.operand1.isFloat) {
					/*mips.add("\tcvt.s.w $f2, $f2");*/
				}
				mips.add("\tl.s $f3, " + curr.operand2.mips());
				/*if (!curr.operand2.isFloat) {
					mips.add("\tcvt.s.w $f3, $f3");
				}*/
				if (curr.operator.equals("breq")) {
					mips.add("\tc.eq.s $f2, $f3");
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brneq")) {
					mips.add("\tc.eq.s $f2, $f3");
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brlt")) {
					mips.add("\tc.lt.s $f2, $f3");
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brgt")) {
					mips.add("\tc.le.s $f2, $f3");
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brgeq")) {
					mips.add("\tc.lt.s $f2, $f3");
					mips.add("\tbc1f " + curr.label);
				} else {
					mips.add("\tc.le.s $f2, $f3");
					mips.add("\tbc1t " + curr.label);
				}
			}
		} else if (a instanceof BranchImm) {
			BranchImm curr = (BranchImm) a;
			if (!(curr.isFloat || curr.operand1.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand1.mips());
				mips.add("\tli $t1, " + curr.operand2);
				if (!curr.ifswitch) {
					mips.add("\t" + curr.mipsOp() + " $t0, $t1, " +curr.label);
				} else {
					mips.add("\t" + curr.mipsOp() + " $t1, $t0, " +curr.label);
				}
			} else {
				mips.add("\tl.s $f2, " + curr.operand1.mips());
				/*if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f2, $f2");
				}*/
				if (curr.isFloat) {
					mips.add("\tli.s $f3, " + curr.operand3);
				} else {
					mips.add("\tli.s $f3, " + curr.operand2);
					/*mips.add("\tcvt.s.w $f3, $f3");*/
				}
				if (curr.operator.equals("breq")) {
					if (!curr.ifswitch) {
						mips.add("\tc.eq.s $f2, $f3");
					} else {
						mips.add("\tc.eq.s $f3, $f2");
					}
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brneq")) {
					if (!curr.ifswitch) {
						mips.add("\tc.eq.s $f2, $f3");
					} else {
						mips.add("\tc.eq.s $f3, $f2");
					}
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brlt")) {
					if (!curr.ifswitch) {
						mips.add("\tc.lt.s $f2, $f3");
					} else {
						mips.add("\tc.lt.s $f3, $f2");
					}
					mips.add("\tc.lt.s $f2, $f3");
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brgt")) {
					if (!curr.ifswitch) {
						mips.add("\tc.le.s $f2, $f3");
					} else {
						mips.add("\tc.le.s $f3, $f2");
					}
					mips.add("\tc.le.s $f2, $f3");
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brgeq")) {
					if (!curr.ifswitch) {
						mips.add("\tc.lt.s $f2, $f3");
					} else {
						mips.add("\tc.lt.s $f3, $f2");
					}
					mips.add("\tbc1f " + curr.label);
				} else {
					if (!curr.ifswitch) {
						mips.add("\tc.le.s $f2, $f3");
					} else {
						mips.add("\tc.le.s $f3, $f2");
					}
					mips.add("\tbc1t " + curr.label);
				}
			}
		} else if (a instanceof BranchTwoImm) {
			BranchTwoImm curr = (BranchTwoImm) a;
			if (!curr.isFloat) {
				mips.add("\tli $t0, " + curr.operand1);
				mips.add("\tli $t1, " + curr.operand2);
				mips.add("\t" + curr.mipsOp() + " $t0, $t1, " +curr.label);
			} else {
				mips.add("\tli.s $f2, " + curr.operand3);
				mips.add("\tli.s $f3, " + curr.operand4);
				if (curr.operator.equals("breq")) {
					mips.add("\tc.eq.s $f2, $f3");
					mips.add("bc1t " + curr.label);
				} else if (curr.operator.equals("brneq")) {
					mips.add("\tc.eq.s $f2, $f3");
					mips.add("bc1f " + curr.label);
				} else if (curr.operator.equals("brlt")) {
					mips.add("c.lt.s $f2, $f3");
					mips.add("bc1t " + curr.label);
				} else if (curr.operator.equals("brgt")) {
					mips.add("c.le.s $f2, $f3");
					mips.add("bc1f " + curr.label);
				} else if (curr.operator.equals("brgeq")) {
					mips.add("c.lt.s $f2, $f3");
					mips.add("bc1f " + curr.label);
				} else {
					mips.add("c.le.s $f2, $f3");
					mips.add("bc1t " + curr.label);
				}
			}
		} else if (a instanceof Return) {
			Return curr = (Return) a;
			if (curr.operand1 != null) {
				if (!curr.operand1.isFloat) {
					mips.add("\tlw $v0, " + curr.operand1.mips());
				} else {
					mips.add("\tl.s $f0, " + curr.operand1.mips());
				}
			} else {
				if (!curr.isFloat) {
					mips.add("\tli $v0, " + curr.operand2);
				} else {
					mips.add("\tli.s $f0, " + curr.operand3);
				}
			}
			mips.add("\tmove $sp, $fp");
			mips.add("\tlw $fp, -4($sp)");
			mips.add("\tlw $ra, -8($sp)");
			mips.add("\tjr $ra");
		} else if (a instanceof Call) {
			Call curr = (Call) a;
			int size = 0;
			for (Temp t : curr.param) {
				if (!t.isFloat) {
					mips.add("\tlw $t0, " + t.mips());
					mips.add("\tsw $t0, " + size * 4 + "($sp)");
				} else {
					mips.add("\tl.s $f2, " + t.mips());
					mips.add("\ts.s $f2, " + size * 4 + "($sp)");
				}
				size++;
			}
			mips.add("\tjal _" + curr.name);
		} else if (a instanceof Callr) {
			Callr curr = (Callr) a;
			int size = 0;
			for (Temp t : curr.param) {
				if (!t.isFloat) {
					mips.add("\tlw $t0, " + t.mips());
					mips.add("\tsw $t0, " + size * 4 + "($sp)");
				} else {
					mips.add("\tl.s $f2, " + t.mips());
					mips.add("\ts.s $f2, " + size * 4 + "($sp)");
				}
				size++;
			}
			mips.add("\tjal _" + curr.name);
			if (!curr.operand.isFloat) {
				mips.add("\tsw $v0, " + curr.operand.mips());
			} else {
				mips.add("\ts.s $f0, " + curr.operand.mips());
			}
		} else if (a instanceof ArrayStore) {
			ArrayStore curr = (ArrayStore) a;
			if (!(curr.operand1.isFloat || curr.arrayname.isFloat)) {
				if (curr.offset1 == null) {
					mips.add("\tlw $t0, " + curr.operand1.mips());
					mips.add("\tsw $t0, " + curr.arrayname.offset(curr.offset));
				} else {
					mips.add("\tlw $t0, " + curr.offset1.mips());
					mips.add("\tsll $t0, $t0, 2");
					mips.add("\tla $t1, " + curr.arrayname.mips());
					mips.add("\tsub $t0, $t1, $t0");
					mips.add("\tlw $t1, " + curr.operand1.mips());
					mips.add("\tsw $t1, 0($t0)");
				}
			} else {
				if (curr.offset1 == null) {
					mips.add("\tl.s $f2, " + curr.operand1.mips());
					/*if (!curr.operand1.isFloat) {
						mips.add("\tcvt.s.w $f2, $f2");
					}*/
					mips.add("\ts.s $f2, " + curr.arrayname.offset(curr.offset));
				} else {
					mips.add("\tlw $t0, " + curr.offset1.mips());
					mips.add("\tsll $t0, $t0, 2");
					mips.add("\tla $t1, " + curr.arrayname.mips());
					mips.add("\tsub $t0, $t1, $t0");
					mips.add("\tl.s $f2, " + curr.operand1.mips());
					/*if (!curr.operand1.isFloat) {
						mips.add("\tcvt.s.w $f2, $f2");
					}*/
					mips.add("\ts.s $f2, 0($t0)");
				}
			}
		} else if (a instanceof ArrayStoreImm) { 
			ArrayStoreImm curr = (ArrayStoreImm) a;
			if (!(curr.isFloat || curr.arrayname.isFloat)) {
				if (curr.offset1 == null) {
					mips.add("\tli $t0, " + curr.operand1);
					mips.add("\tsw $t0, " + curr.arrayname.offset(curr.offset));
				} else {
					mips.add("\tlw $t0, " + curr.offset1.mips());
					mips.add("\tsll $t0, $t0, 2");
					mips.add("\tla $t1, " + curr.arrayname.mips());
					mips.add("\tsub $t0, $t1, $t0");
					mips.add("\tli $t1, " + curr.operand1);
					mips.add("\tsw $t1, 0($t0)");
				}
			} else {
				if (curr.offset1 == null) {
					if (curr.isFloat) {
						mips.add("\tli.s $f2, " + curr.operand2);
					} else {
						mips.add("\tli.s $f2, " + curr.operand1);
						/*mips.add("\tcvt.s.w $f2, $f2");*/
					}
					mips.add("\ts.s $f2, " + curr.arrayname.offset(curr.offset));
				} else {
					mips.add("\tlw $t0, " + curr.offset1.mips());
					mips.add("\tsll $t0, $t0, 2");
					mips.add("\tla $t1, " + curr.arrayname.mips());
					mips.add("\tsub $t0, $t1, $t0");
					if (curr.isFloat) {
						mips.add("\tli.s $f2, " + curr.operand2);
					} else {
						mips.add("\tli.s $f2, " + curr.operand1);
						/*mips.add("\tcvt.s.w $f2, $f2");*/
					}
					mips.add("\ts.s $f2, 0($t0)");
				}
			}
		} else if (a instanceof ArrayLoad) {
			ArrayLoad curr = (ArrayLoad) a;
			if (!(curr.arrayname.isFloat || curr.operand1.isFloat)) {
				if (curr.offset1 == null) {
					mips.add("\tlw $t0, " + curr.arrayname.offset(curr.offset));
					mips.add("\tsw $t0, " + curr.operand1.mips());
				} else {
					mips.add("\tlw $t0, " + curr.offset1.mips());
					mips.add("\tsll $t0, $t0, 2");
					mips.add("\tla $t1, " + curr.arrayname.mips());
					mips.add("\tsub $t0, $t1, $t0");
					mips.add("\tlw $t0, 0($t0)");
					mips.add("\tsw $t0, " + curr.operand1.mips());
				} 
			} else {
				if (curr.offset1 == null) {
					mips.add("\tl.s $f2, " + curr.arrayname.offset(curr.offset));
					/*if (!curr.arrayname.isFloat) {
						mips.add("\tcvt.s.w $f2, $f2");
					}*/
					mips.add("\ts.s $f2, " + curr.operand1.mips());
				} else {
					mips.add("\tlw $t0, " + curr.offset1.mips());
					mips.add("\tsll $t0, $t0, 2");
					mips.add("\tla $t1, " + curr.arrayname.mips());
					mips.add("\tsub $t0, $t1, $t0");
					mips.add("\tl.s $f2, 0($t0)");
					/*if (!curr.arrayname.isFloat) {
						mips.add("\tcvt.s.w $f2, $f2");
					}*/
					mips.add("\ts.s $f2, " + curr.operand1.mips());
				}
			}
		} else if (a instanceof ArrayAssign) {
			ArrayAssign curr = (ArrayAssign) a;
			if (!(curr.arrayname.isFloat || curr.isFloat)) {
				mips.add("\tli $t0, " + curr.value);
				for (int i = 0; i < curr.size; i++) {
					mips.add("\tsw " + new Temp(-8) + ", " + curr.arrayname.offset(i));
				}
			} else {
				if (!curr.isFloat) {
					mips.add("\tli.s $f2, " + curr.value);
					/*mips.add("\tcvt.s.w $f2, $f2");*/
				} else {
					mips.add("\tli.s $f2, " + curr.value1);
				}
				for (int i = 0; i < curr.size; i++) {
					mips.add("\ts.s $f2, " + curr.arrayname.offset(i));
				}
			}
		} else if (a instanceof InsLabel) {
			InsLabel curr = (InsLabel) a;
			if (curr.label1 == null) {
				mips.add(curr.toString());
			} else {
				mips.add(curr.toString());
				mips.add("\tsw $fp, -4($sp)");
				mips.add("\tsw $ra, -8($sp)");
				mips.add("\tmove $fp, $sp");
				int s = size.get(curr.label1).size * 4 + 24;
				mips.add("\tsub $sp, $sp, " + s);
			}
		} else if (a instanceof PrintCall) {
			PrintCall curr = (PrintCall) a;
			if (curr.functname.equals("printi")) {
				if (curr.param1 != null) {
					mips.add("\tli $v0, 1");
					mips.add("\tlw $a0, " + curr.param1.mips());
					mips.add("\tsyscall");
				} else {
					mips.add("\tli $v0, 1");
					mips.add("\tli $a0, " + curr.param2);
					mips.add("\tsyscall");
				}
			} else if (curr.functname.equals("printf")) {
				if (curr.param1 != null) {
					mips.add("\tli $v0, 2");
					mips.add("\tl.s $f12, " + curr.param1.mips());
					mips.add("\tsyscall");
				} else {
					if (curr.isFloat) {
						mips.add("\tli $v0, 2");
						mips.add("\tli.s $f12, " + curr.param3);
						mips.add("\tsyscall");
					} else {
						mips.add("\tli $v0, 2");
						mips.add("\tli.s $f12, " + curr.param2);
						/*mips.add("\tcvt.s.w $f2, $f2");*/
						mips.add("\tsyscall");
					}
				}
			}
		} else if (a instanceof ReadCall) {
			ReadCall curr = (ReadCall) a;
			if (curr.functname.equals("readi")) {
				mips.add("\tli $v0, 5");
				mips.add("\tsyscall");
				mips.add("\tsw $v0, " + curr.operand1.mips());
			} else if (curr.functname.equals("readf")) {
				mips.add("\tli $v0, 6");
				mips.add("\tsyscall");
				mips.add("\ts.s $f0, " + curr.operand1.mips());
			}
		} else if (a instanceof EndFunct) {
			mips.add("\tmove $sp, $fp");
			mips.add("\tlw $fp, -4($sp)");
			mips.add("\tlw $ra, -8($sp)");
			mips.add("\tjr $ra");
		} else if (a instanceof FunctParam) {
			ArrayList<Temp> curr = ((FunctParam) a).param;
			int size = 0;
			for (Temp t : curr) {
				if (!t.isFloat) {
					mips.add("\tlw $t0, " + size * 4 + "($fp)");
					mips.add("\tsw $t0, " + t.mips());
				} else {
					mips.add("\tl.s $f2, " + size * 4 + "($fp)");
					mips.add("\ts.s $f2, " + t.mips());
				}
			}
		}
	}
	
	public void naiveTranslateFile() {
		mips.add("\t.data");
		mips.add("\t.text");
		mips.add("\t.globl main");
		for (Instruction i : ori) {
			naiveTranslate(i);
		}
	}
	
	public String toString() {
		String a = "";
		for (String s : mips) {
			a += s + "\n";
		}
		return a;
	}
	
	public void toFile() {
		try {
    		PrintWriter writer = new PrintWriter("output.s", "UTF-8");
    		writer.println(this.toString());
    		writer.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}
}