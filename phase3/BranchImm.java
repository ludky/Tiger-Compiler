package p3;

public class BranchImm implements Instruction {
	
	protected String operator;
	protected Temp operand1;
	protected int operand2;
	protected float operand3;
	protected Label label;
	boolean isFloat, ifswitch;
	
	public BranchImm(boolean ifs, String op, Temp op1, int op2, Label lb) {
		ifswitch = ifs;
		operator = op;
		operand1 = op1;
		operand2 = op2;
		label = lb;
	}
	
	public BranchImm(boolean ifs, String op, Temp op1, float op3, Label lb, boolean isf) {
		ifswitch = ifs;
		operator = op;
		operand1 = op1;
		operand3 = op3;
		label = lb;
		isFloat = isf;
	}
	
	public String mipsOp() {
		if (operator.equals("breq")) {
			return "beq";
		} else if (operator.equals("brneq")) {
			return "bne";
		} else if (operator.equals("brlt")) {
			return "blt";
		} else if (operator.equals("brgt")) {
			return "bgt";
		} else if (operator.equals("brgeq")) {
			return "bge";
		} else if (operator.equals("brleq")) {
			return "ble";
		} else {
			return "wtf";
		}
	}
	
	public String toString() {
		if (!ifswitch) {
			return isFloat? operator + ", " + operand1 + ", " + operand3 + ", " + label
						: operator + ", " + operand1 + ", " + operand2 + ", " + label;
		} else {
			String ans = operator + ", ";
			ans += isFloat? operand3 + ", " + operand1 + ", " + label
						  : operand2 + ", " + operand1 + ", " + label;
			return ans;
		}
	}
	
}
