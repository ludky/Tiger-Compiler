package p3;

public class ArrayItem {
	protected int size1;
	protected int size2;
	protected String name;
	protected boolean isFloat;
	
	public ArrayItem(String name, int size1, int size2, boolean isFloat) {
		this.name = name;
		this.size1 = size1;
		this.size2 = size2;
		this.isFloat = isFloat;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSize1() {
		return size1;
	}
	
	public int getSize2() {
		return size2;
	}
	
	public boolean getFloat() {
		return isFloat;
	}
}
