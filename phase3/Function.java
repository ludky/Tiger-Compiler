package p3;

import java.util.ArrayList;

public class Function extends Type {

	private Type returnType;
	private ArrayList<Type> paramList;
	
	public Function(Type rt, ArrayList<Type> pl) {
		super("function");
		returnType = rt;
		paramList = pl;
	}
	
	public Type getReturnType() {
		return returnType;
	}
	
	public ArrayList<Type> getParamList() {
		return paramList;
	}
	
	public String toString() {
		String s = "Type Name: " + typeName + "; Return Type: (" + returnType
				   + "); Parameter List: {";
		for (Type t : paramList) {
			s += "(" + t + ")";
		}
		s += "}";
		return s;
	}
}