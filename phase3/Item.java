package p3;

public class Item {
	protected String tempName;
	protected int isArray;
	protected String type;
	
	public Item(String tempName, String type, int isArray) {
		this.tempName = tempName;
		this.isArray = isArray;
		this.type = type;
	}
	
	public String getTempName() {
		return tempName;
	}
	
	public int getIsArray() {
		return isArray;
	}
	
	public String getType() {
		return type;
	}
}
