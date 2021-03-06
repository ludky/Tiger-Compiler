public class Array extends Type {

	private Type baseType;
	private int size1;
	private int size2;
	private boolean is2D;
	
	public Array(String tn, Type bt, int size1) {
		this(tn, bt, size1, 0, false);
	}
	
	public Array(String tn, Type bt, int size1, int size2, boolean is2D) {
		super(tn);
		baseType = bt;
		this.size1 = size1;
		this.size2 = size2;
		this.is2D = is2D;
	}
	
	public Type getBaseType() {
		return baseType;
	}
	
	public int getSize1() {
		return size1;
	}
	
	public int getSize2() {
		return size2;
	}
	
	public boolean getIs2D() {
		return is2D;
	}
	
	public String toString() {
		String s = "Type Name: " + typeName + "; Size1: " + size1;
		s += is2D ? "; Size2: " + size2 : "";
		s += "; Base Type: (" + baseType + ")";
		return s;
	}
}
