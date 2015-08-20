package p3;

public class BranchTwoImm implements Instruction {
	
	protected String operator;
	protected int operand1, operand2;
	protected Label label;
	protected float operand3, operand4;
	protected boolean isFloat;
	
	public BranchTwoImm(String op, int op1, int op2, Label lb) {
		operator = op;
		operand1 = op1;
		operand2 = op2;
		label = lb;
	}
	
	public BranchTwoImm(String op, float op3, float op4, Label lb, boolean isf) {
		operator = op;
		operand3 = op3;
		operand4 = op4;
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
		return isFloat ? operator + ", " + operand3 + ", " + operand4 + ", " + label
						 : operator + ", " + operand1 + ", " + operand2 + ", " + label;
	}
	
}
