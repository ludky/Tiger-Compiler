package p3;

public class ST implements Instruction {

	protected Temp operand1, operand2;
	
	public ST(Temp o1, Temp o2) {
		operand1 = o1;
		operand2 = o2;
	}
	
	public String toString() {
		return "st, " + operand1 + ", " + operand2 + ", ";
	}
}
