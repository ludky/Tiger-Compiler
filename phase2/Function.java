import java.util.ArrayList;

public class Function extends Type {

	private Type returnType;
	private ArrayList<Type> paramList;
	
	public Function(String tn, Type rt, ArrayList<Type> pl) {
		super(tn);
		returnType = rt;
		paramList = pl;
	}
	
	public Type getReturnType() {
		return returnType;
	}
	
	public ArrayList<Type> getParamList() {
		return paramList;
	}
}
