import java.util.*;

public class Register {

	public enum regType = {INT, FLOAT};

	private String regName;
	//private String regValue();

	public Register(String regName, enum regType) {
		this.regName = regName;
		this.regType = regType;
	}

	public enum type() {
		return regType;
	}

	public String regName() {
		return regName;
	}

}
