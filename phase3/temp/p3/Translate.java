package p3;

import java.util.ArrayList;

public class Translate {
	
	protected ArrayList<Instruction> mips;
	protected ArrayList<Instruction> ori;
	
	public Translate(ArrayList<Instruction> IR) {
		ori = IR;
		mips = new ArrayList<>();
	}
	
	public void naiveTranslate(Instruction a) {
		if (a instanceof Binary) {
			Binary curr = (Binary) a;
			mips.add(new LD(new Temp(-8), curr.operand1));
			mips.add(new LD(new Temp(-9), curr.operand2));
			mips.add(new Binary(curr.operator, new Temp(-8), new Temp(-9), new Temp(-9)));
			mips.add(new ST(new Temp(-9), curr.operand3));
		} else if (a instanceof BinaryImm) { 
			BinaryImm curr = (BinaryImm) a;
			mips.add(new LD(new Temp(-8), curr.operand1));
			mips.add(new BinaryImm(curr.operator, new Temp(-8), curr.operand2, new Temp(-8)));
			mips.add(new ST(new Temp(-8), curr.operand3));
		} else if (a instanceof BinaryTwoImm) { 
			BinaryTwoImm curr = (BinaryTwoImm) a;
			mips.add(new BinaryTwoImm(curr.operator, curr.operand1, curr.operand2, new Temp(-8)));
			mips.add(new ST(new Temp(-8), curr.operand3));
		} else if (a instanceof Assignment) {
			Assignment curr = (Assignment) a;
			mips.add(new LD(new Temp(-8), curr.operand1));
			mips.add(new Assignment(new Temp(-9), new Temp(-8)));
			mips.add(new ST(new Temp(-9), curr.operand2));
		} else if (a instanceof AssignImm) {
		
		} else if (a instanceof Goto) {
			mips.add(a);
		} else if (a instanceof Branch) {
			Branch curr = (Branch) a;
			mips.add(new LD(new Temp(-8), curr.operand1));
			mips.add(new LD(new Temp(-9), curr.operand2));
			mips.add(new Branch(curr.operator, new Temp(-8), new Temp(-9), curr.label));
		} else if (a instanceof Return) {
			Return curr = (Return) a;
			mips.add(new LD(new Temp(-8), curr.operand));
			mips.add(new Return(new Temp(-8)));
		} else if (a instanceof Call) {
			
		} else if (a instanceof Callr) {
			
		} else if (a instanceof ArrayStore) {
			
		} else if (a instanceof ArrayLoad) {
			
		} else if (a instanceof InsLabel) {
			mips.add(a);
		}
	}
	
	public void naiveTranslateFile() {
		for (Instruction i : ori) {
			naiveTranslate(i);
		}
	}
	
	public String toString() {
		String a = "";
		for (Instruction s : mips) {
			a += s + "\n";
		}
		return a;
	}
	
	public static void main(String[] args) {
		Label l1 = new Label();
    	Label l2 = new Label();
    	Label l3 = new Label();
    	Label l4 = new Label();
    	ArrayList<Instruction> ins = new ArrayList<>();
    	ins.add(new BinaryImm("add", new Temp(), 1, new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Branch("brlt", new Temp(), new Temp(), l1));
    	ins.add(new Assignment(new Temp(), new Temp()));
    	ins.add(new InsLabel(l1));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Goto(l3));
    	ins.add(new InsLabel(l2));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new InsLabel(l3));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Branch("brlt", new Temp(), new Temp(), l4));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new InsLabel(l4));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	for (Instruction s : ins) {
    		System.out.println(s);
    	}
    	System.out.println();
    	Translate a = new Translate(ins);
		a.naiveTranslateFile();
		System.out.println(a);
    	System.out.println();
    	GenerateCode gc = new GenerateCode(a.mips);
    	gc.generateFile();
    	System.out.println(gc);
	}
}