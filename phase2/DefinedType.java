
public class DefinedType extends Type{

	private Type baseType;
	
	public DefinedType(String tn, Type bt) {
		super(tn);
		baseType = bt;
	}
	
	public Type getBaseType() {
		return baseType;
	}
}
