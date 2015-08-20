package p3;

import java.util.ArrayList;
public class IRGenerator {
	
	private ArrayList<String> buffer;
	private int labelInt;
	private int funcInt;
	private int tempInt;
	/*private TreeWalker tw;*/

	public IRGenerator() {
		buffer = new ArrayList<String>();
		labelInt = 0;
		tempInt = 0;
		funcInt = 0;
	}
	
	public int getTempInt() {
		return tempInt;
	}
	
	public String newFunc() {
		funcInt++;
		return "func" + funcInt;
	}
	
	public void reset() {
		tempInt = 0;
	}

	public void addToSt(String identifier, String type) {
		Type tempType = new Type(type);
		tempType.setIdentifier(identifier);
		TigerParser.st.insert(identifier, tempType);
	}
	
	public String newTemp() {
		tempInt++;
		String ret = "temp" + tempInt;
		return ret;
	}
	
/*	public void setTW(TreeWalker tw) {
		this.tw = tw;
	}*/
	
	public String newLabel(String labelName) {
		return labelName;
	}
	
	public String newLabel() {
		labelInt++;
		return newLabel("label" + labelInt);
	}

	public void emit(String ins) {
		buffer.add(ins);
	}
	
	public ArrayList<String> getBuffer(){
		return buffer;
	}
	
	public void print() {
		for (String s: buffer) {
			System.out.println(s);
		}
	}
}
