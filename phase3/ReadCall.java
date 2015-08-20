package p3;

public class ReadCall implements Instruction {

	protected String functname;
	protected Temp operand1;
	
	public ReadCall(String fc, Temp op) {
		functname = fc;
		operand1 = op;
	}
	
	public String toString() {
		return "callr, " + operand1 + ", " + functname;
	}
}
