package p3;

public class Temp
{
	protected static int count = 0;
	protected int number;
	protected String name;
	protected boolean isFloat;
	protected int base;
	protected boolean changed;

	public Temp() {
		
		this(false);
	}
	
	public Temp(boolean isf)
	{
		number = ++count;
		name = "t" + number;
		isFloat = isf;
	}
	
	public Temp(String n)
	{
		name = n;
	}
	
	public Temp(int t) {
		number = t;
		if (t>0)
			name = "t" + number;
		switch (t) {
		case 0:
			name = "$zero";
			break;
		case -2:
			name = "$v0";
			break;
		case -4:
			name = "$a0";
			break;
		case -5:
			name = "$a1";
			break;
		case -6:
			name = "$a2";
			break;
		case -7:
			name = "$a3";
			break;
		case -8:
			name = "$t0";
			break;
		case -9:
			name = "$t1";
			break;
		case -10:
			name = "$t2";
			break;
		case -11:
			name = "$t3";
			break;
		case -12:
			name = "$t4";
			break;
		case -13:
			name = "$t5";
			break;
		case -14:
			name = "$t6";
			break;
		case -15:
			name = "$t7";
			break;
		case -16:
			name = "$s0";
			break;
		case -17:
			name = "$s1";
			break;
		case -18:
			name = "$s2";
			break;
		case -19:
			name = "$s3";
			break;
		case -20:
			name = "$s4";
			break;
		case -21:
			name = "$s5";
			break;
		case -22:
			name = "$s6";
			break;
		case -23:
			name = "$s7";
			break;
		case -24:
			name = "$t8";
			break;
		case -25:
			name = "$t9";
			break;
		case -29:
			name = "$sp";
			break;
		case -30:
			name = "$fp";
			break;
		case -31:
			name = "$ra";
			break;
		}
	}
	
	public Temp(String n, int t)
	{
		name = n;
		number = t;
	}
	
	public void setBase(int a) {
		if (!changed) {
			base = a;
			changed = true;
		}
	}
	
	public void setFloat(boolean isf) {
		isFloat = isf;
	}
	
	public String toString()
	{
		return name;
	}
	
	public String mips() {
		if (number <= 0) {
			return name;
		}
		else
			return (- base - number * 4 - 8) + "($fp)";
	}
	
	public String offset(int a) {
		return (- base - (number + a) * 4 - 8) + "($fp)";
	}
	
	public boolean equals(Object o) {
		return ((Temp) o).name.equals(this.name);
	}
}
