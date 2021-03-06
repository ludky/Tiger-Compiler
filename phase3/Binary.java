package p3;

public class Binary implements Instruction {

	protected String operator;
	protected Temp operand1, operand2, operand3;
	
	public Binary(String op, Temp o1, Temp o2, Temp o3) {
		operator = op;
		operand1 = o1;
		operand2 = o2;
		operand3 = o3;
	}
	
	public String mipsOp() {
		if (!(operand1.isFloat || operand2.isFloat || operand3.isFloat)) {
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
		return operator + ", " + operand1 + ", " + operand2 + ", " + operand3;
	}
}