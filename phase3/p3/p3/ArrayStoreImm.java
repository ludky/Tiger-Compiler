package p3;

public class ArrayStoreImm implements Instruction {

	protected Temp arrayname, offset1;
	protected int offset, operand1;
	
	public ArrayStoreImm(Temp an, int os, int op) {
		arrayname = an;
		offset = os;
		operand1 = op;
	}
	
	public ArrayStoreImm(Temp an, Temp os, int op) {
		arrayname = an;
		offset1 = os;
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
