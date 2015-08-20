package p3;

import java.util.*;

public class StringToInstruction {

	private List<String> string;
	private ArrayList<String> floatArr;
	private int base;
	protected HashMap<Integer, Temp> hm;

	private ArrayList<Instruction> instruction;
	private ArrayList<Temp> tl;
	ArrayList<Temp> floatL;
 	private int used;

	public StringToInstruction(ArrayList<String> string) {
		this.string = string;
		instruction = new ArrayList<Instruction>();
		floatArr = new ArrayList<String>();
		floatL = new ArrayList<Temp>();
		tl = new ArrayList<Temp>();
		hm = new HashMap<Integer, Temp>();
		base = 0;
		//saveFloat();
		convert(string);
		used = 0;
	}
	
	public Temp store(int i) {
		if (hm.get(i) == null) {
			Temp temp = new Temp("temp" + i, i);
			hm.put(i, temp);
/*			System.out.println("create new temp" + i);
*/			return temp;
		} else {
/*			System.out.println("get old" + 1);
*/			return hm.get(i);
		}
	}

	public ArrayList<Instruction> getOutput(){
		return instruction;
	}

	public void saveFloat() {
		for (String ins : string) {
			ins = ins.replaceAll("\\s+","");
			String[] insA = ins.split("\\s*,\\s*");
			boolean isFloat = false;
			if(insA[0].equals("add") || insA[0].equals("sub")
					|| insA[0].equals("mult") || insA[0].equals("div")) {
				for (int i = 1; i < insA.length; i++) {
					if (floatArr.contains(insA[i])) {
						isFloat = true;
					}
					if (insA[i].indexOf(".") != -1) {
						isFloat = true;
					}
				}
				if (true) {
					floatArr.add(insA[3]);
				}
			} else if(insA[0].equals("assign")) {
				if (insA.length == 3) {
					if (insA[2].indexOf(".") != -1) {
						floatArr.add(insA[1]);
					}
				}
			} else if (insA[0].equals("float_var")) {
				floatArr.add(insA[1]);
			} else if (insA[0].equals("array_load")) {
				if (floatArr.contains(insA[2])) {
					floatArr.add(insA[1]);
				}
			}
		}
	}
	public void convert(ArrayList<String> string) {
		ArrayList<Instruction> instr = new ArrayList<Instruction>();
		for(String ins: string) {
			ins = ins.replaceAll("\\s+","");
			String[] insA = ins.split("\\s*,\\s*");

			if(insA[0].equals("add") || insA[0].equals("sub")
			|| insA[0].equals("mult") || insA[0].equals("div")) {
				int i3 = Integer.parseInt(insA[3].split("p")[1]);
				if (insA[1].charAt(0) == 't' && insA[2].charAt(0) == 't') {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					int i2 = Integer.parseInt(insA[2].split("p")[1]);
					Temp a = store(i1);
					Temp b = store(i2);
					Temp c = store(i3);
					tl.add(a);
					tl.add(b);
					tl.add(c);
					a.setBase(base);
					b.setBase(base);
					c.setBase(base);
					instr.add(new Binary(insA[0], a, b, c));
					if (c.isFloat || a.isFloat || b.isFloat) {
						c.setFloat(true);
					} else {
						c.setFloat(false);
					}
				} else if (insA[1].charAt(0) == 't') {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					Temp a = store(i1);
					Temp c = store(i3);
					tl.add(a);
					tl.add(c);
					a.setBase(base);
					c.setBase(base);
					if (!c.isFloat && !a.isFloat && insA[2].indexOf(".") == -1) {
						c.setFloat(false);
						instr.add(new BinaryImm(false, insA[0], a, Integer.parseInt(insA[2]), c));
					} else {
						c.setFloat(true);
						instr.add(new BinaryImm(false, insA[0], a, Float.parseFloat(insA[2]), c, true));
					}
				} else if (insA[2].charAt(0) == 't') {
					int i2 = Integer.parseInt(insA[2].split("p")[1]);
					/*instr.add(new BinaryImm(insA[0], Integer.parseInt(insA[1]), new Temp(insA[2], i1), new Temp(insA[3], i3)));
				*/
					Temp b = store(i2);
					Temp c = store(i3);
					b.setBase(base);
					c.setBase(base);
					tl.add(b);
					tl.add(c);
					if (!c.isFloat && !b.isFloat && insA[1].indexOf(".") == -1) {
						c.setFloat(false);
						instr.add(new BinaryImm(true, insA[0], b, Integer.parseInt(insA[1]), c));
					} else {
						c.setFloat(true);
						instr.add(new BinaryImm(true, insA[0], b, Float.parseFloat(insA[1]), c, true));
					}
					
				} else {
					Temp c = store(i3);
					tl.add(c);
					c.setBase(base);
					if (!c.isFloat && insA[1].indexOf(".") == -1 && insA[2].indexOf(".") == -1) {
						c.setFloat(false);
						instr.add(new BinaryTwoImm(insA[0], Integer.parseInt(insA[1]), Integer.parseInt(insA[2]), c));
					} else {
						c.setFloat(true);
						instr.add(new BinaryTwoImm(insA[0], Float.parseFloat(insA[1]), Float.parseFloat(insA[2]), c, true));
					}
				}

			} else if(insA[0].equals("assign")) {
				if (insA.length == 3) {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					if (insA[2].charAt(0) == 't') {
						int i2 = Integer.parseInt(insA[2].split("p")[1]);
						Temp a = store(i1);
						Temp b = store(i2);
						tl.add(a);
						tl.add(b);
						a.setBase(base);
						b.setBase(base);
						instr.add(new Assignment(a, b));
						if (a.isFloat || b.isFloat) {
							a.setFloat(true);
						} else {
							a.setFloat(false);
						}
					} else {
						Temp a = store(i1);
						tl.add(a);
						a.setBase(base);
						if (!a.isFloat && insA[2].indexOf(".") == -1) {
							a.setFloat(false);
							instr.add(new AssignImm(a, Integer.parseInt(insA[2])));
						} else {
							a.setFloat(true);
							instr.add(new AssignImm(a, Float.parseFloat(insA[2]), true));
						}
					}
				} else {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					Temp a = store(i1);
					a.setBase(base);
					tl.add(a);
					if (!a.isFloat && insA[3].indexOf(".") == -1) {
						a.setFloat(false);
						instr.add(new ArrayAssign(a, Integer.parseInt(insA[2]), Integer.parseInt(insA[3])));
					} else {
						a.setFloat(true);
						instr.add(new ArrayAssign(a, Integer.parseInt(insA[2]), Float.parseFloat(insA[3]), true));
					}
				}
				
				
				
				
				
				
				
			} else if(insA[0].equals("brneq") || insA[0].equals("breq")
					||insA[0].equals("brlt") || insA[0].equals("brgt")
					||insA[0].equals("brgeq") || insA[0].equals("brleq")) {
				if (insA[1].charAt(0) == 't' && insA[2].charAt(0) == 't') {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					int i2 = Integer.parseInt(insA[2].split("p")[1]);
					Temp a = store(i1);
					Temp b = store(i2);
					a.setBase(base);
					b.setBase(base);
					tl.add(a);
					tl.add(b);
					instr.add(new Branch(insA[0], a, b, new Label(insA[3])));
				} else if (insA[1].charAt(0) == 't') {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					Temp a = store(i1);
					a.setBase(base);
					tl.add(a);
					if (insA[2].indexOf(".") == -1) {
						instr.add(new BranchImm(false, insA[0], a, Integer.parseInt(insA[2]), new Label(insA[3])));
					} else {
						instr.add(new BranchImm(false, insA[0], a, Float.parseFloat(insA[2]), new Label(insA[3]), true));
					}
				} else if (insA[2].charAt(1) == 't') {
					int i2 = Integer.parseInt(insA[2].split("p")[1]);
					Temp b = store(i2);
					b.setBase(base);
					tl.add(b);
					if (insA[1].indexOf(".") == -1) {
						instr.add(new BranchImm(true, insA[0], b, Integer.parseInt(insA[1]), new Label(insA[3])));
					} else {
						instr.add(new BranchImm(true, insA[0], b, Float.parseFloat(insA[1]), new Label(insA[3]), true));
					}
				} else {
					if (insA[1].indexOf(".") == -1 && insA[2].indexOf(".") == -1) {
						instr.add(new BranchTwoImm(insA[0], Integer.parseInt(insA[2]), Integer.parseInt(insA[2]), new Label(insA[3])));
					} else {
						instr.add(new BranchTwoImm(insA[0], Float.parseFloat(insA[2]), Float.parseFloat(insA[2]), new Label(insA[3]), true));
					}
				}
			} else if(insA[0].equals("return")) {
				if (insA[1].charAt(0) == 't') {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					Temp a = store(i1);
					a.setBase(base);
					tl.add(a);
					instr.add(new Return(a));
				} else {
					if (insA[1].indexOf(".") == -1) {
						instr.add(new Return(Float.parseFloat(insA[1]), true));
					} else {
						instr.add(new Return(Integer.parseInt(insA[1])));
					}
				}
			} else if(insA[0].equals("goto")) {
				instr.add(new Goto(new Label(insA[1])));
			} else if (insA[0].equals("call")) {
				if (insA[1].equals("printi") || insA[1].equals("printf")) {
					if (insA[2].charAt(0) == 't') {
						int i2 = Integer.parseInt(insA[2].split("p")[1]);
						Temp b = store(i2);
						b.setBase(base);
						tl.add(b);
						instr.add(new PrintCall(insA[1], b));
					} else {
						if (insA[2].indexOf(".") == -1) {
							int i2 = Integer.parseInt(insA[2]);
							instr.add(new PrintCall(insA[1], i2));
						} else {
							float i2 = Float.parseFloat(insA[2]);
							instr.add(new PrintCall(insA[1], i2, true));
						}
					}
				} else {
					String fname = insA[1];
					ArrayList<Temp> at = new ArrayList<Temp>();
					for (int k = 2; k < insA.length; k++) {
						int ik = Integer.parseInt(insA[k].split("p")[1]);
						Temp tmp = store(ik);
						at.add(tmp);
					}
					instr.add(new Call(fname, at));
				}
			} else if (insA[0].equals("callr")) {
				if (insA[2].equals("readi") || insA[2].equals("readf")) {
					int i3 = Integer.parseInt(insA[3].split("p")[1]);
					Temp toRead = store(i3);
					instr.add(new ReadCall(insA[2], toRead));
				} else {
					String fname = insA[2];
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					Temp target = store(i1);
					ArrayList<Temp> at = new ArrayList<Temp>();
					for (int k = 3; k < insA.length; k++) {
						int ik = Integer.parseInt(insA[k].split("p")[1]);
						Temp tmp = store(ik);
						at.add(tmp);
					}
					instr.add(new Callr(target, fname, at));
				}
			} else if (insA[0].equals("array_load")) {
				if (insA[3].charAt(0) != 't') {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					int i2 = Integer.parseInt(insA[2].split("p")[1]);
					Temp a = store(i1);
					Temp b = store(i2);
					a.setBase(base);
					b.setBase(base);
					tl.add(a);
					tl.add(b);
					if (a.isFloat) {
						a.setFloat(true);
					} else {
						a.setFloat(false);
					}
					instr.add(new ArrayLoad(a, b, Integer.parseInt(insA[3])));
				} else {
					int i1 = Integer.parseInt(insA[1].split("p")[1]);
					int i2 = Integer.parseInt(insA[2].split("p")[1]);
					int i3 = Integer.parseInt(insA[3].split("p")[1]);
					Temp a = store(i1);
					Temp b = store(i2);
					Temp c = store(i3);
					a.setBase(base);
					b.setBase(base);
					c.setBase(base);
					tl.add(a);
					tl.add(b);
					tl.add(c);
					if (a.isFloat) {
						a.setFloat(true);
					} else {
						a.setFloat(false);
					}
					instr.add(new ArrayLoad(a, b, c));
				}
			} else if (insA[0].equals("array_store")) {
				if (insA[3].charAt(0) == 't') {
						if (insA[2].charAt(0) != 't') {
							int i1 = Integer.parseInt(insA[1].split("p")[1]);
							int i3 = Integer.parseInt(insA[3].split("p")[1]);
							Temp a = store(i1);
							Temp c = store(i3);
							a.setBase(base);
							
							c.setBase(base);
							tl.add(a);
							tl.add(a);
							if (a.isFloat || c.isFloat) {
								a.setFloat(true);
							} else {
								a.setFloat(false);
							}
							instr.add(new ArrayStore(a, Integer.parseInt(insA[2]), c));
						} else {
							int i1 = Integer.parseInt(insA[1].split("p")[1]);
							int i3 = Integer.parseInt(insA[3].split("p")[1]);
							int i2 = Integer.parseInt(insA[2].split("p")[1]);
							Temp a = store(i1);
							Temp b = store(i2);
							Temp c = store(i3);
							a.setBase(base);
							b.setBase(base);
							c.setBase(base);
							tl.add(a);
							tl.add(b);
							tl.add(c);
							if (a.isFloat || c.isFloat) {
								a.setFloat(true);
							} else {
								a.setFloat(false);
							}
							instr.add(new ArrayStore(a, b, c));
						}
				} else {
					if (insA[2].charAt(0) != 't') {
						int i1 = Integer.parseInt(insA[1].split("p")[1]);
						Temp a = store(i1);
						a.setBase(base);
						tl.add(a);
						if (!a.isFloat && insA[3].indexOf(".") == -1) {
							a.setFloat(false);
							instr.add(new ArrayStoreImm(a, Integer.parseInt(insA[2]), Integer.parseInt(insA[3])));
						} else {
							a.setFloat(true);
							instr.add(new ArrayStoreImm(a, Integer.parseInt(insA[2]), Float.parseFloat(insA[3]), true));
						}
					} else {
						int i1 = Integer.parseInt(insA[1].split("p")[1]);
						int i2 = Integer.parseInt(insA[2].split("p")[1]);
						Temp a = store(i1);
						Temp b = store(i2);
						a.setBase(base);
						b.setBase(base);
						tl.add(a);
						tl.add(b);
						if (!a.isFloat && insA[3].indexOf(".") == -1) {
							a.setFloat(false);
							instr.add(new ArrayStoreImm(a, b, Integer.parseInt(insA[3])));
						} else {
							a.setFloat(true);
							instr.add(new ArrayStoreImm(a, b, Float.parseFloat(insA[3]), true));
						}
					}
				}
			} else if (insA[0].equals("array_dec")) {
				int i1 = Integer.parseInt(insA[2].split("p")[1]);
				Temp tp = store(i1);
				tp.setBase(base);
				base = base + (Integer.parseInt(insA[1]) - 1) * 4;
				used += Integer.parseInt(insA[1]) - 1;
			} else if ((insA[0].charAt(0) == '_') || insA[0].equals("main:")) {
/*				for (int t : hm.keySet()) {
					Temp tp = hm.get(t);
					if (floatArr.contains(tp.name)) {
						tp.setFloat(true);
					}
				}*/
				/*floatArr = new ArrayList<String>();*/
				hm = new HashMap<Integer, Temp>();
				base = 0;
				instr.add(new InsLabel(new FunctLabel(insA[0])));
			} else if (insA[0].equals("used")) {
				int u = Integer.parseInt(insA[1]);
				u = u + used;
				used = 0;
				instr.add(new EndFunct(u));
			} else if (insA[0].equals("param")) {
				ArrayList<Temp> at = new ArrayList<>();
				for (int k = 1; k < insA.length; k++) {
					int ik = Integer.parseInt(insA[k].split("p")[1]);
					Temp tmp = store(ik);
					at.add(tmp);
				}
				instr.add(new FunctParam(at));
			}
			else if (insA[0].equals("float_var")) {
				int i1 = Integer.parseInt(insA[1].split("p")[1]);
				Temp tp = store(i1);
				tp.setFloat(true);
			} else {
				instr.add(new InsLabel(new Label(insA[0])));
			}
		}
		instruction = instr;
	}
	public ArrayList<Instruction> getInstructionList() {
		return instruction;
	}

}