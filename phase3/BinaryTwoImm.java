package p3;

public class BinaryTwoImm implements Instruction {
	
	protected String operator;
	protected Temp operand3;
	protected int operand1, operand2;
	protected float operand4, operand5;
	protected boolean isFloat;
	
	public BinaryTwoImm(String op, int o1, int o2, Temp o3) {
		operator = op;
		operand1 = o1;
		operand2 = o2;
		operand3 = o3;
	}
	
	public BinaryTwoImm(String op, float o4, float o5, Temp o3, boolean isf) {
		operator = op;
		operand4 = o4;
		operand5 = o5;
		operand3 = o3;
		isFloat = isf;
	}
	
	public String mipsOp() {
		if (!(operand3.isFloat || isFloat)) {
			if (operator.equals("mult")) {
				return "mul";
			} else {
				return operator;
			}
		} else {
			if (operator.equals("mult")) {
				return "mul.s";
			} else {
				return operator + ".s";
			}
		}
	}
	
	public String toString() {
		String ans = operator + ", ";
		ans += isFloat ? operand4 + ", " + operand5 + ", " + operand3
						: operand1 + ", " + operand2 + ", " + operand3;
		return ans;
	}
}
