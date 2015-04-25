//package p3;

public class InsLabel implements Instruction {

	protected Label label;
	
	public InsLabel(Label lb) {
		label = lb;
	}
	
	public String toString() {
		return label.toString() + ":";
	}
	
	public boolean equals(Object o) {
		if (o instanceof InsLabel) {
			InsLabel curr = (InsLabel) o;
			return this.label.equals(((InsLabel) o).label);
		}
		return false;
	}
}
