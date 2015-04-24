import java.util.*;

public class IRGenerator {

	private SymbolTable st;
	private List<String> ir_code;
	private FileWriter output_ir;
	private static final MAX_REG_SIZE = 32;
	private int t_idx = 0;
	private int l_idx = 0;
	
	String[] temp = String[MAX_REG_SIZE];
	
	public IRGenerator(SymbolTable st, FileWriter output_ir) {
		this.st = st;
		this.output_ir = output_ir;
		ir_code = new ArrayList<String>();
	}

	public static String emit(String toEmit) {
		String formatted = toEmit + "\n";
		//ir_code.add(formatted);
		return formatted;
	}
	
	public static String emit_func_dec(String id) {
		String emitted = id + ": ";
	//	ir_code.add(emitted);
		return emitted;
  	  }
/*
	public static String emit_func_return_type(String type) {
		String
	}
*/
	public static String emit_label(String toEmit) {
		String formatted = toEmit + ": \n";
		//ir_code.add(formatted);
		return formatted;
	}


	public static String emit_assign_stat(String var, String val) {
		String emitted = "assign, " + var + ", " + val;
		//ir_code.add(emitted);		
		return emitted;
   	 }

	public static String emit_array_load(String a, String array_name, int offset) {
		String des = a;		
/*
		if(a.equals("null")) {
			des = getTarget();
			//IRSet.array_load(des, array_name, offset);
		}
*/
			String emitted = IRSet.array_load(des, array_name, offset);
		return emitted;
	}


	public static String emit_binary_op(String op, String a, String b, String t) {
		String emitted;
		switch(op) {
			case "PLUS":
				emitted = emit_add(a, b, t);
				break;
			case "MINUS":
				emitted = emit_sub(a, b, t);
				break;
			case "MULT":
				emitted = emit_mult(a, b, t);
				break;
			case "DIV":
				emitted = emit_div(a, b, t);
				break;

		}
		return emitted;

	}

	public static String emit_mult(String a, String b, String des) {
		//String des = getTarget();
		String emitted = IRSet.mult(a, b, des);
		//ir_code.add(emitted);
		return emitted;
	}

	public static String emit_div(String a, String b, String des) {
		//String des = getTarget();
		String emitted = IRSet.div(a, b, des);
		//ir_code.add(emitted);
		return emitted;
	}

	private static String getTarget() {
		String tar = "t" + Integer.toString(t_idx);
		t_idx++;
		return tar;
	}

	public static String emit_add(String a, String b, String des) {
		//String des = getTarget();
		String emitted = IRSet.add(a, b, des);
		//ir_code.add(emitted);
		return emitted;
	}

	public static String emit_sub(String a, String b, String des) {
		//String des = getTarget();
		String emitted = IRSet.sub(a, b, des);
		//ir_code.add(emitted);
		return emitted;
	}

	private static String getBranchLabel() {
		String label = "Label_" + Integer.toString(l_idx) + ": ";

		l_idx++;
		return tar;
	}
	public static String emit_branch(String b_op, String a, String b, String label) {
		//String label;
		String emitted;
		switch(b_op) {
			case "breq":
				emitted = emit_breq(a, b);
				break;
			case "brneq":
				emitted = emit_brneq(a, b);
				break;
			case "brlt":
				emitted = emit_brlt(a, b);
				break;
			case "brgt":
				emitted = emit_brgt(a, b);
				break;
			case "brgeq":
				emitted = emit_brgeq(a, b);
				break;

			case "brleq":
				emitted = emit_brleq(a, b);
				break;
		}

		return emitted;

	}
	
	public static String emit_breq(String a, String b, String label) {

		//String label = getBranchLabel();
		String emitted = IRSet.breq(a, b, label);

		//ir_code.add(emitted);
		return label;
	}

	public static String emit_brneq(String a, String b, String label) {
		//String label = getBranchLabel();
		String emitted = IRSet.brneq(a, b, label);

		//ir_code.add(emitted);
		return label;
	}

	public static String emit_brlt(String a, String b, String label) {
		//String label = getBranchLabel();
		String emitted = IRSet.brlt(a, b, label);

		//ir_code.add(emitted);
		return label;
	}

	public static String emit_brgt(String a, String b, String label) {
		//String label = getBranchLabel();
		String emitted = IRSet.brgt(a, b, label);

		//ir_code.add(emitted);
		return label;
	}

	public static String emit_brgeq(String a, String b, String label) {
		//String label = getBranchLabel();
		String emitted = IRSet.brgeq(a, b, label);

		//ir_code.add(emitted);
		return label;
	}

	public static String emit_brleq(String a, String b, String label) {
		//String label = getBranchLabel();
		String emitted = IRSet.brleq(a, b, label);

		//ir_code.add(emitted);
		return label;
	}
	
	public static List<String> getIRList() {
		return ir_code;
	}
}
