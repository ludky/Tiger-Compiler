package p3;

public class ArrayLoad implements Instruction {

	protected Temp operand1, arrayname, offset1;
	protected int offset;
	
	public ArrayLoad(Temp op, Temp an, int os) {
		operand1 = op;
		arrayname = an;
		offset = os;
	}
	
	public ArrayLoad(Temp op, Temp an, Temp of) {
		operand1 = op;
		arrayname = an;
		offset1 = of;
	}
	
	public String toString() {
		if (offset1 == null) {
			return "array_load, " + operand1 + ", " + arrayname + ", " + offset;
		} else {
			return "array_load, " + operand1 + ", " + arrayname + ", " + offset1;
		}
	}
}