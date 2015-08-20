package p3;

public class ArrayStore implements Instruction {

	protected Temp arrayname, operand1, offset1;
	protected int offset;
	
	public ArrayStore(Temp an, int os, Temp op) {
		arrayname = an;
		offset = os;
		operand1 = op;
	}
	
	public ArrayStore(Temp an, Temp of, Temp op) {
		arrayname = an;
		offset1 = of;
		operand1 = op;
	}
	
	public String toString() {
		if (offset1 == null) {
			return "array_store, " + arrayname + ", " + offset + ", " + operand1;
		} else {
			return "array_store, " + arrayname + ", " + offset1 + ", " + operand1;
		}
	}
}
