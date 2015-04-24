package p3;

public class Assignment implements Instruction {
	
	Temp operand1, operand2;
	
	public Assignment(Temp op1, Temp op2) {
		operand1 = op1;
		operand2 = op2;
	}
}
