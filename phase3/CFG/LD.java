package p3;

public class LD implements Instruction {

	protected Temp operand1, operand2;
	
	public LD(Temp o1, Temp o2) {
		operand1 = o1;
		operand2 = o2;
	}
	
	public String toString() {
		return "ld, " + operand1 + ", " +  operand2 + ", ";
	}
}