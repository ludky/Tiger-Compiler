package p3;

public class Label {

	protected static int count = 0;
	protected int number;
	protected String name;

	public Label()
	{
		number = ++count;
		name = "L" + number;
	}
	
	public Label(String a) {
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
