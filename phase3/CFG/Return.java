package p3;

public class Return implements Instruction {

	protected Temp operand;
	protected Label label;
	
	public Return(Temp o1) {
		operand = o1;
	}
	
	public String toString() {
		return "return, " + operand + ", , ";
	}
}