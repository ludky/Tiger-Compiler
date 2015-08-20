package p3;

public class DefinedType extends Type{

	private Type baseType;
	
	public DefinedType(Type bt) {
		super("definedtype");
		baseType = bt;
	}
	
	public Type getBaseType() {
		return baseType;
	}
	
	public String toString() {
		return "Type Identifier: " + identifier + "; Type Name: " + typeName
			   +"; Base Type: (" + baseType + ")";
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof DefinedType)) {
			return false;
		} else {
			DefinedType curr = (DefinedType) o;
			return typeName.equals(curr.typeName) && identifier.equals(curr.identifier)
					&& baseType.equals(curr.baseType);
		}
	}
	
	public Type getCopy() {
		DefinedType a = new DefinedType(baseType);
		a.setIdentifier(identifier);
		a.setIsVar(isVar);
		return a;
	}
}