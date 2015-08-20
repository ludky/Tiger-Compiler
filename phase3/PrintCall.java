package p3;

public class PrintCall implements Instruction {

	protected String functname;
	protected Temp param1;
	int param2;
	float param3;
	boolean isFloat;
	
	public PrintCall(String fc, Temp pr) {
		functname = fc;
		param1 = pr;
	}
	
	public PrintCall(String fc, int pr) {
		functname = fc;
		param2 = pr;
	}
	
	public PrintCall(String fc, float pr, boolean isf) {
		functname = fc;
		param3 = pr;
		isFloat = isf;
	}
	
	public String toString() {
		if (param1 != null) {
			return "call, " + functname + ", " + param1;
		} else {
			if (isFloat) {
				return "call, " + functname + ", " + param3;
			} else {
				return "call, " + functname + ", " + param2;
			}
		}
	}
}
