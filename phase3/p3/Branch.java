package p3;

public class Branch implements Instruction {
	
	protected String operator;
	protected Temp operand1, operand2;
	protected Label label;
	
	public Branch(String op, Temp op1, Temp op2, Label lb) {
		operator = op;
		operand1 = op1;
		operand2 = op2;
		label = lb;
	}
	
	public String mipsOp() {
		if (operator.equals("breq")) {
			return "bne";
		} else if (operator.equals("brneq")) {
			return "beq";
		} else if (operator.equals("brlt")) {
			return "bgt";
		} else if (operator.equals("brgt")) {
			return "blt";
		} else if (operator.equals("brgeq")) {
			return "bge";
		} else if (operator.equals("brleq")) {
			return "ble";
		} else {
			return "wtf";
		}
	}
	
	public String toString() {
		return operator + ", " + operand1 + ", " + operand2 + ", " + label;
	}
}
