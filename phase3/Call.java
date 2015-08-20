package p3;

import java.util.ArrayList;

public class Call implements Instruction {

	protected String name;
	protected ArrayList<Temp> param;
	
	public Call(String nm, ArrayList<Temp> pm) {
		name = nm;
		param = pm;
	}
}