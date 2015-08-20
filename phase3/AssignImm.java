package p3;

public class AssignImm implements Instruction {

	protected Temp operand1;
	protected int operand2;
	protected float operand3;
	protected boolean isFloat;
	
	public AssignImm(Temp op1, int op2) {
		operand1 = op1;
		operand2 = op2;
	}
	
	public AssignImm(Temp op1, float op3, boolean isf) {
		operand1 = op1;
		operand3 = op3;
		isFloat = isf;
	}
	
	public String toString() {
		return isFloat ? "assign, " + operand1 + ", " + operand3
						: "assign, " + operand1 + ", " + operand2;
	}
}
