//package p3;

public class Goto implements Instruction {

	protected Label label;
	
	public Goto(Label lb) {
		label = lb;
	}
	
	public String toString() {
		return "Goto, " + label;
	}
}
