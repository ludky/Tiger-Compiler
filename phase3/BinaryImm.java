package p3;

public class BinaryImm implements Instruction {
	
	protected String operator;
	protected Temp operand1, operand4;
	protected int operand2;
	protected float operand3;
	protected boolean isFloat, ifswitch;
	
	public BinaryImm(boolean ifs, String op, Temp o1, int o2, Temp o4) {
		ifswitch = ifs;
		operator = op;
		operand1 = o1;
		operand2 = o2;
		operand4 = o4;
	}
	
	public BinaryImm(boolean ifs, String op, Temp o1, float o3, Temp o4, boolean isf) {
		ifswitch = ifs;
		operator = op;
		operand1 = o1;
		operand3 = o3;
		operand4 = o4;
		isFloat = isf;
	}
	
	public String mipsOp() {
		if (!(operand4.isFloat || isFloat || operand1.isFloat)) {
			if (operator.equals("mult")) {
				return "mul";
			} else {
				return operator;
			}
		}
		else {
			if (operator.equals("mult")) {
				return "mul.s";
			} else {
				return operator + ".s";
			}
		}
	}
	
	public String toString() {
		if (!ifswitch) {
			String ans = operator + ", " + operand1 + ", ";
			ans += isFloat ? operand3 + ", " + operand4 : operand2 + ", " + operand4;
			return ans;
		} else {
			String ans = operator + ", ";
			ans += isFloat ? operand3 + ", " + operand1 + ", " + operand4
							: operand2 + ", " + operand1 + ", " + operand4;
			return ans;
		}
	}
}
