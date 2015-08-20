package p3;

public class Return implements Instruction {

	protected Temp operand1;
	protected int operand2;
	protected float operand3;
	protected boolean isFloat;
	protected Label label;
	
	public Return(Temp o1) {
		operand1 = o1;
	}
	
	public Return(int o2) {
		operand2 = o2;
	}
	
	public Return (float o3, boolean isf) {
		operand3 = o3;
		isFloat = isf;
	}
	
	public String toString() {
		if (operand1 != null) {
			return "return, " + operand1 + ", , ";
		} else {
			if (isFloat) {
				return "return, " + operand3 + ", , ";
			} else {
				return "return, " + operand2 + ", , ";
			}
		}
	}
}