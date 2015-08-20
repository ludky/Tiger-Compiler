package p3;

public class Comparison {
	protected String op1;
	protected String op2;
	protected int comp;
	protected int isAnd;
	
	public Comparison(String op1, String op2, int comp, int isAnd) {
		this.op1 = op1;
		this.op2 = op2;
		this.comp = comp;
		this.isAnd = isAnd;
	}
}
