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
	
	public String toString(){
		return name;
	}
}
