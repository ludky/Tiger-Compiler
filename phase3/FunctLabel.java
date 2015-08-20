package p3;

public class FunctLabel {
	
	protected static int count = 0;
	protected int number;
	protected String name;

	public FunctLabel()
	{
		number = ++count;
		name = "FUNCT" + number;
	}
	
	public FunctLabel(String a) {
		name = a;
	}
	
	public String toString(){
		return name;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Label) {
			Label curr = (Label) o;
			return this.name.equals(curr.name);
		}
		return false;
	}
	
}
