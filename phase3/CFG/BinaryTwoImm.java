package p3;

public class BinaryTwoImm implements Instruction{
	
	protected String operator;
	protected Temp operand3;
	protected int operand1, operand2;
	
	public BinaryTwoImm(String op, int o1, int o2, Temp o3) {
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
