
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
}
