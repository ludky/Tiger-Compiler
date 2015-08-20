package p3;

public class ArrayAssign implements Instruction {

	protected Temp arrayname;
	protected int size, value;
	protected float value1;
	protected boolean isFloat;
	
	public ArrayAssign(Temp op, int s, int v) {
		arrayname = op;
		size = s;
		value = v;
	}
	
	public ArrayAssign(Temp op, int s, float v, boolean isf) {
		arrayname = op;
		size = s;
		value1 = v;
		isFloat = isf;
	}
	
	public String toString() {
		return "assign, " + arrayname + ", " + size + ", " + value;
	}	
}
