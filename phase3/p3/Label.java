package p3;

public class Label {

	protected static int count = 0;
	protected int number;
	protected String name;

	public Label(String name) {
		this.name = name;
		number = -1;
	}

	public Label()
	{
		number = ++count;
		name = "L" + number;
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
