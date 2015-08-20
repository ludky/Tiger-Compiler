package p3;

import java.util.ArrayList;

public class Callr implements Instruction {
	
	protected Temp operand;
	protected String name;
	protected ArrayList<Temp> param;

	public Callr(Temp op, String nm, ArrayList<Temp> pm) {
		operand = op;
		name = nm;
		param = pm;
	}
	
	public String toString() {
		String ans = "callr, " + operand + ", " + name;
		for (Temp t : param) {
			ans += ", " + t;
		}
		return ans;
	}
}
