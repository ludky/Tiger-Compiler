


public class IRSet {

    
    /*  assign(op, x, y) */

    public static String assign(String a, String b) {
	return "assign, " + a + ", " +b;
    }
    
    /* binary arth(op, y, z, x) */
    public static String add(String a, String b, String target) {
	return "add, " + a + ", " + b + ", " + target;
    }
    
    public static String sub(String a, String b, String target) {
	return "sub, " + a + ", " + b + ", " + target;
    }
	
    public static String mult(String a, String b, String target) {
        return "mult, " + a + ", " + b + ", " + target;
    }
    public static String div(String a, String b, String target) {
	return "div, " + a + ", " + b + ", " + target;
    }

    public static String and(String a, String b, String target) {
	return "and, " + a + ", " + b + ", " + target;
    }

    public static String or(String a, String b, String target) {
	return "or, " + a + ", " + b + ", " + target;
    }
	
    /* Goto (op, label) */ 
    public static String gotoLabel(String label) {	
	return "goto, " + label;
    }
	
    /* Branch (op, y, z, label) */
	
    public static String breq(String a, String b, String label) {
	return " breq, " + a + ", " + b + ", " + label;
    }
    
    public static String brneq(String a, String b, String label) {
	return "brneq, " + a + ", " + b +", " + label;
    }
	
    public static String brlt(String a, String b, String label) {
	return "brlt, " + a + ", " + b +", " + label;
    }
	
    public static String brgt(String a, String b, String label) {
	return "brgt, " + a + ", " + b +", " + label;
    }

    public static String brgeq(String a, String b, String label) {
	return "breq, " + a + ", " + b + ", "+ label;
    }

    public static String brleq(String a, String b, String label) {
	return "brleq, " + a + ", " + b + ", " + label;
    }
	
    /* Return (op, x) */
	
    public static String returnVal(String a) {
	return "return, " + a + ", , ";
    }
	
    /* Function call without return(op, func_name, [param1 .. n]) */

    public static String call(String func_name, String[] params) {
	String toRet = "call, " + func_name;
	
	for (int i = 0; i < params.length; i++) {
	    toRet += (", " + params[i]);
	}
	return toRet;
    }
	
	/* Function call with return (op, x, func_name, [param1 .. n]) */
    public static String callr(String a, String func_name, String[] params) {
	String toRet = "callr, " + a + ", " +func_name;
	
	for (int i = 0; i < params.length; i++) {
	    toRet += (", " + params[i]);
	}
	return toRet;
    }
	
	/* Store into array (op, array_name, offset, x) */
	

    public static String array_store(String array_name, int offset, String value) {
	return "array_store, " + array_name + ", " + offset + ", " + value;
    }
	
	/* Load from array (op, x, array_name, offset) */

    public static String array_load(String a, String array_name, int offset) {
	return "array_load, " + a + ", " + array_name + ", " + offset;
    }
	
	/* assign array(op, x, size, value) */

    public static String assign(String array_name, int size, String value) {
	return "assign, " + array_name + ", " size + ", " + value;
    }
}
