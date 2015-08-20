package p3;

public class ArrayStoreImm implements Instruction {

	protected Temp arrayname, offset1;
	protected int offset, operand1;
	protected float operand2;
	protected boolean isFloat;
	
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
	
	public ArrayStoreImm(Temp an, int os, float op, boolean isf) {
		arrayname = an;
		offset = os;
		operand2 = op;
		isFloat = isf;
	}
	
	public ArrayStoreImm(Temp an, Temp os, float op, boolean isf) {
		arrayname = an;
		offset1 = os;
		operand2 = op;
		isFloat = isf;
	}
	
	public String toString() {
		if (!isFloat) {
			if (offset1 == null) {
				return "array_store, " + arrayname + ", " + offset + ", " + operand1;
			} else {
				return "array_store, " + arrayname + ", " + offset1 + ", " + operand1;
			}
		} else {
			if (offset1 == null) {
				return "array_store, " + arrayname + ", " + offset + ", " + operand2;
			} else {
				return "array_store, " + arrayname + ", " + offset1 + ", " + operand2;
			}
		}
	}
}
