package p3;

public class BinaryImm implements Instruction {
	
	protected String operator;
	protected Temp operand1, operand3;
	protected int operand2;
	
	public BinaryImm(String op, Temp o1, int o2, Temp o3) {
		operator = op;
		operand1 = o1;
		operand2 = o2;
		operand3 = o3;
	}
	
	public String mipsOp() {
		if (operator.equals("mult")) {
			return "mul";
		} else {
			return operator;
		}
	}
	
	public String toString() {
		return operator + ", " + operand1 + ", " + operand2 + ", " + operand3;
	}
}
