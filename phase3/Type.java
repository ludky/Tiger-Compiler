package p3;

public class Type {
	
	protected String typeName;
	protected String identifier;
	protected boolean isVar;
	
	public Type(String tn) {
		typeName = tn;
	}

	public String getIdentifier() {
		return identifier;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void setIdentifier(String id) {
		identifier = id;
	}
	
	public String toString() {
		return "Type Name: " + typeName;
	}
	
	public boolean getIsVar() {
		return isVar;
	}
	
	public void setIsVar(boolean a) {
		isVar = a;
	}
	
	public boolean equals(Object o) {
		Type curr = (Type) o;
		return typeName.equals(curr.typeName);
	}
	
	public Type getBaseType() {
		return null;
	}
	
	public Type getCopy() {
		Type a = new Type(typeName);
		a.setIdentifier(identifier);
		a.setIsVar(isVar);
		return a;
	}
}