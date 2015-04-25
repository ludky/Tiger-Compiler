package p3;

import java.util.ArrayList;

public class Translate {
	
	public ArrayList<String> mips = new ArrayList<>();
	
	public void naiveTranslate(Instruction a) {
		if (a instanceof Binary) {
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
		} else if (a instanceof Return) {
			
		} else if (a instanceof Call) {
			
		} else if (a instanceof Callr) {
			
		} else if (a instanceof ArrayStore) {
			
		} else if (a instanceof ArrayLoad) {
			
		}
	}
	
	public void naiveTranslate(ArrayList<Instruction> a) {
		for (Instruction i : a) {
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
	
	public static void main(String[] args) {
		Translate a = new Translate();
		ArrayList<Instruction> curr = new ArrayList<>();
		curr.add(new Binary("add", new Temp(), new Temp(), new Temp()));
		a.naiveTranslate(curr);
		System.out.println(a);
	}
}