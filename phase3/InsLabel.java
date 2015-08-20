package p3;

public class InsLabel implements Instruction {

	protected Label label;
	protected FunctLabel label1;
	
	public InsLabel(Label lb) {
		label = lb;
	}
	
	public InsLabel(FunctLabel l1) {
		label1 = l1;
	}
	
	public String toString() {
		if (label1 == null) {
			return label.toString();
		} else {
			return label1.toString();
		}
	}
	
	public boolean equals(Object o) {
		if (o instanceof InsLabel) {
			InsLabel curr = (InsLabel) o;
			if (curr.label == null && this.label == null) {
				return this.label1.equals(curr.label1);
			} else if (curr.label1 == null && this.label1 == null) {
				return this.label.equals(curr.label);
			} else {
				return false;
			}
		}
		return false;
	}
}
