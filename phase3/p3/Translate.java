package p3;

import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

public class Translate {
	
	protected ArrayList<String> mips;
	protected ArrayList<Instruction> ori;
	
	public Translate(ArrayList<Instruction> IR) {
		ori = IR;
		mips = new ArrayList<>();
	}
	
	public void naiveTranslate(Instruction a) {
		if (a instanceof Binary) {
			Binary curr = (Binary) a;
			if (!(curr.operand1.isFloat || curr.operand2.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand1.mips());
				mips.add("\tlw $t1, " + curr.operand2.mips());
				mips.add("\t" + curr.mipsOp() + " $t0, $t0, $t1");
				mips.add("\tsw $t0, " + curr.operand3.mips());
			} else {
				mips.add("\tl.s $f0, " + curr.operand1.mips());
				if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f0, $f0");
				}
				mips.add("\tl.s $f1, " + curr.operand2.mips());
				if (!curr.operand2.isFloat) {
					mips.add("\tcvt.s.w $f1, $f1");
				}
				mips.add("\t" + curr.mipsOp() + " $f0, $f0, $f1");
				mips.add("\ts.s $f0, " + curr.operand3.mips());
			}
		} else if (a instanceof BinaryImm) { 
			BinaryImm curr = (BinaryImm) a;
			if (!(curr.isFloat || curr.operand1.isFloat)) {
				mips.add("\tlw $t0, " + curr.operand1.mips());
				mips.add("\tli $t1, " + curr.operand2);
				if (!curr.ifswitch) {
					mips.add("\t" + curr.mipsOp() + " $t0, $t0, $t1");
				} else {
					mips.add("\t" + curr.mipsOp() + " $t0, $t1, $t0");
				}
				mips.add("\tsw $t0, " + curr.operand4.mips());
			} else {
				mips.add("\tl.s $f0, " + curr.operand1.mips());
				if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f0, $f0");
				}
				mips.add("\tli.s $f1, " + curr.operand3);
				if (!curr.isFloat) {
					mips.add("\tcvt.s.w $f1, $f1");
				}
				if (!curr.ifswitch) {
					mips.add("\t" + curr.mipsOp() + " $f0, $f0, $f1");
				} else {
					mips.add("\t" + curr.mipsOp() + " $f0, $f1, $f0");
				}
				mips.add("\ts.s $f0, " + curr.operand4.mips());
			}
		} else if (a instanceof BinaryTwoImm) {
			BinaryTwoImm curr = (BinaryTwoImm) a;
			if (!curr.isFloat) {
				mips.add("\tli $t0, " + curr.operand1);
				mips.add("\tli $t1, " + curr.operand2);
				mips.add("\t" + curr.mipsOp() + " $t0, $t0, $t1");
				mips.add("\tsw $t0, " + curr.operand3.mips());
			} else {
				mips.add("\tli.s $f0, " + curr.operand4);
				mips.add("\tli.s $f1, " + curr.operand5);
				mips.add("\t" + curr.mipsOp() + " $f0, $f0, $f1");
				mips.add("\ts.s $f0, " + curr.operand3.mips());
			}
		} else if (a instanceof Assignment) {
			Assignment curr = (Assignment) a;
			if (!curr.operand2.isFloat) {
				mips.add("\tlw $t0, " + curr.operand2.mips());
				mips.add("\tsw $t0, " + curr.operand1.mips());
			} else {
				mips.add("\tl.s $f0, " + curr.operand2.mips());
				mips.add("\ts.s $f0, " + curr.operand1.mips());
			}
		} else if (a instanceof AssignImm) {
			AssignImm curr = (AssignImm) a;
			if (!curr.isFloat) {
				mips.add("\tli $t0, " + curr.operand2);
				mips.add("\tsw $t0, " + curr.operand1.mips());
			} else {
				mips.add("\tli.s $f0, " + curr.operand3);
				mips.add("\ts.s $f0, " + curr.operand1.mips());
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
				mips.add("\tl.s $f0, " + curr.operand1.mips());
				if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f0, $f0");
				}
				mips.add("\tl.s $f1, " + curr.operand2.mips());
				if (!curr.operand2.isFloat) {
					mips.add("\tcvt.s.w $f1, $f1");
				}
				if (curr.operator.equals("breq")) {
					mips.add("\tc.eq.s $f0, $f1");
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brneq")) {
					mips.add("\tc.eq.s $f0, $f1");
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brlt")) {
					mips.add("\tc.lt.s $f0, $f1");
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brgt")) {
					mips.add("\tc.le.s $f0, $f1");
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brgeq")) {
					mips.add("\tc.lt.s $f0, $f1");
					mips.add("\tbc1f " + curr.label);
				} else {
					mips.add("\tc.le.s $f0, $f1");
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
				mips.add("\tl.s $f0, " + curr.operand1.mips());
				if (!curr.operand1.isFloat) {
					mips.add("\tcvt.s.w $f0, $f0");
				}
				mips.add("\tli.s $f1, " + curr.operand3);
				if (!curr.isFloat) {
					mips.add("\tcvt.s.w $f1, $f1");
				}
				if (curr.operator.equals("breq")) {
					if (!curr.ifswitch) {
						mips.add("\tc.eq.s $f0, $f1");
					} else {
						mips.add("\tc.eq.s $f1, $f0");
					}
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brneq")) {
					if (!curr.ifswitch) {
						mips.add("\tc.eq.s $f0, $f1");
					} else {
						mips.add("\tc.eq.s $f1, $f0");
					}
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brlt")) {
					if (!curr.ifswitch) {
						mips.add("\tc.lt.s $f0, $f1");
					} else {
						mips.add("\tc.lt.s $f1, $f0");
					}
					mips.add("\tc.lt.s $f0, $f1");
					mips.add("\tbc1t " + curr.label);
				} else if (curr.operator.equals("brgt")) {
					if (!curr.ifswitch) {
						mips.add("\tc.le.s $f0, $f1");
					} else {
						mips.add("\tc.le.s $f1, $f0");
					}
					mips.add("\tc.le.s $f0, $f1");
					mips.add("\tbc1f " + curr.label);
				} else if (curr.operator.equals("brgeq")) {
					if (!curr.ifswitch) {
						mips.add("\tc.lt.s $f0, $f1");
					} else {
						mips.add("\tc.lt.s $f1, $f0");
					}
					mips.add("\tbc1f " + curr.label);
				} else {
					if (!curr.ifswitch) {
						mips.add("\tc.le.s $f0, $f1");
					} else {
						mips.add("\tc.le.s $f1, $f0");
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
				mips.add("\tl.s $f0, " + curr.operand3);
				mips.add("\tli.s $f1, " + curr.operand4);
				if (curr.operator.equals("breq")) {
					mips.add("\tc.eq.s $f0, $f1");
					mips.add("bc1t " + curr.label);
				} else if (curr.operator.equals("brneq")) {
					mips.add("\tc.eq.s $f0, $f1");
					mips.add("bc1f " + curr.label);
				} else if (curr.operator.equals("brlt")) {
					mips.add("c.lt.s $f0, $f1");
					mips.add("bc1t " + curr.label);
				} else if (curr.operator.equals("brgt")) {
					mips.add("c.le.s $f0, $f1");
					mips.add("bc1f " + curr.label);
				} else if (curr.operator.equals("brgeq")) {
					mips.add("c.lt.s $f0, $f1");
					mips.add("bc1f " + curr.label);
				} else {
					mips.add("c.le.s $f0, $f1");
					mips.add("bc1t " + curr.label);
				}
			}
		} else if (a instanceof Return) {
			Return curr = (Return) a;
			mips.add("\tmove $sp, $fp");
			mips.add("\tlw $fp, -4($sp)");
			mips.add("\tlw $ra, -8($sp)");
			mips.add("\tjr $ra");
		} else if (a instanceof Call) {
			
		} else if (a instanceof Callr) {
			
		} else if (a instanceof ArrayStore) {
			ArrayStore curr = (ArrayStore) a;
			mips.add("\tlw $t0, " + curr.operand1.mips());
			mips.add("\tsw $t0, " + curr.arrayname.offset(curr.offset));
		} else if (a instanceof ArrayLoad) {
			ArrayLoad curr = (ArrayLoad) a;
			mips.add("\tlw $t0, " + curr.arrayname.offset(curr.offset));
			mips.add("\tsw $t0, " + curr.operand1.mips());
		} else if (a instanceof ArrayAssign) {
			ArrayAssign curr = (ArrayAssign) a;
			mips.add("\tli $t0, " + curr.value);
			for (int i = 0; i < curr.size; i++) {
				mips.add("\tsw " + new Temp(-8) + ", " + curr.arrayname.offset(i));
			}
		} else if (a instanceof InsLabel) {
			InsLabel curr = (InsLabel) a;
			mips.add(curr.toString());
		} else if (a instanceof SystemCall) {
			SystemCall curr = (SystemCall) a;
			if (curr.functname.equals("printi")) {
				mips.add("\tli $v0, 1");
				mips.add("\tlw $a0, " + curr.param.mips());
				mips.add("\tsyscall");
			} else if (curr.functname.equals("printf")) {
				mips.add("\tli $v0, 2");
				mips.add("\tl.s $f12, " + curr.param.mips());
				mips.add("\tsyscall");
			}
		}
	}
	
	public void naiveTranslateFile() {
		mips.add("\t.data");
		mips.add("\t.text");
		mips.add("\t.globl main");
		mips.add((new InsLabel(new Label("main"))).toString());
		for (Instruction i : ori) {
			naiveTranslate(i);
		}
		mips.add("\tjr $ra");
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
    		PrintWriter writer = new PrintWriter("haha.s", "UTF-8");
    		writer.println(this.toString());
    		writer.close();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}
}
