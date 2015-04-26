package p3;

import java.util.ArrayList;

public class GenerateCode {

	protected ArrayList<String> mips;
	protected ArrayList<Instruction> tt;
	
	public GenerateCode(ArrayList<Instruction> t) {
		tt = t;
		mips = new ArrayList<>();
	}
	
	public void generateFile() {
		for (Instruction a : tt) {
			generateIns(a);
		}
	}
	
	public void generateIns(Instruction a) {
		if (a instanceof LD) {
			LD curr = (LD) a;
			mips.add("lw " + curr.operand1 + ", " + curr.operand2.mips());
		} else if (a instanceof ST) {
			ST curr = (ST) a;
			mips.add("sw " + curr.operand1 + ", " + curr.operand2.mips());
		} else if (a instanceof Binary) {
			Binary curr = (Binary) a;
			mips.add(curr.mipsOp() + " " + curr.operand3 + ", " + curr.operand1 + ", " + curr.operand2);
		} else if (a instanceof BinaryImm) {
			BinaryImm curr = (BinaryImm) a;
			mips.add("li " + new Temp(-2) + ", " + curr.operand2);
			mips.add(curr.mipsOp() + " " + curr.operand3 + ", " + new Temp(-2) + ", " + curr.operand1);
		} else if (a instanceof BinaryTwoImm) {
			BinaryTwoImm curr = (BinaryTwoImm) a;
			mips.add("li " + new Temp(-2) + ", " + curr.operand1);
			mips.add("li " + new Temp(-4) + ", " + curr.operand2);
			mips.add(curr.mipsOp() + " " + curr.operand3 + ", " + new Temp(-2) + ", " + new Temp(-4));
		} else if (a instanceof Assignment) {
			Assignment curr = (Assignment) a;
			mips.add("move " + curr.operand1 + ", " + curr.operand2);
		} else if (a instanceof Branch) {
			Branch curr = (Branch) a;
			mips.add(curr.mipsOp() + " " + curr.operand1 + ", " + curr.operand2 + ", " + curr.label);
		}
	}
	
	public String toString() {
		String ans = "";
		for (String s : mips) {
			ans += s + "\n";
		}
		return ans;
	}
}


/*if (a instanceof Binary) {
	Binary curr = (Binary) a;
	mips.add("lw $t0, " + curr.operand1.mips());
	mips.add("lw $t1, " + curr.operand2.mips());
	mips.add(curr.mipsOp() + " $t0, $t0, $t1");
	mips.add("sw $t0, " + curr.operand3.mips());
} else if (a instanceof Assignment) {
	Assignment curr = (Assignment) a;
	mips.add("lw $t0, " + curr.operand1.mips());
	mips.add("sw $t0, " + curr.operand2.mips());
} else if (a instanceof Goto) {
	Goto curr = (Goto) a;
	mips.add("j, " + curr.label);
} else if (a instanceof Branch) {
	Branch curr = (Branch) a;
	mips.add("lw $t0, " + curr.operand1.mips());
	mips.add("lw $t1, " + curr.operand2.mips());
	mips.add(curr.mipsOp() + " $t0, $t1, " + curr.label);
} else if (a instanceof Return) {*/
