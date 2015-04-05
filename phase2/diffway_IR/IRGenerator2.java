import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class IRGenerator2 {

    private SymbolTable sy;

    private FileWriter fw;

    public IRGenerator2() {
	/*defualt generator*/
    }

    public IRGenerator2(SymbolTable sy) {
	this.sy = sy;
    }

    public IRGenerator2(FileWriter fw) {
	this.fw = fw;
    }

    public static String emitFunc_dec(String id) {
	return id + ": ";
    }
	
    public static String dec_stat(String id, String value) {
	return "assign, " + id + ", " + value;
    }
    public static String assign_stat(String var, String targetVal) {
	return "assign, " + var + ", " + targetVal;
    }
    
    public static String func_call(Function func, ArrayList<Type> paramList, String target) {
	String toRet = "";
	String[] params = new String[paramList.size()];

	for (int i = 0; i < paramList.size(); i++) {
	    params[i] = paramList.get(i).getIdentifier();
	}

	if (func.getReturnType().getTypeName().equals("void")) {
	    toRet += call(func.getIdentifier(), params);
	} else {
	    toRet += callr(target, func.getIdentifier(), params);
	}
	return toRet;
    }

    private static String call(String func_name, String[] params) {
	String toRet = "call, " + func_name;
	
	for (int i = 0; i < params.length; i++) {
	    toRet += (", " + params[i]);
	}
	return toRet;
    }
	
	/* Function call with return (op, x, func_name, [param1 .. n]) */
    private static String callr(String a, String func_name, String[] params) {
	String toRet = "callr, " + a + ", " +func_name;
	
	for (int i = 0; i < params.length; i++) {
	    toRet += (", " + params[i]);
	}
	return toRet;
    }
	

	public static String break_stat(String label) {
		return "goto, " + label;
	}
	
	
	/**
	 * Attempts to write an input IR String list to a file.
	 * 
	 * @param filename The output file to write to.
	 * @param inputIR A list of IR Strings.
	 * @return True if write was successful; false otherwise.
	 */
	public static boolean writeIRToFile(String filename, List<String> inputIR) {
		try {
			FileWriter writer = new FileWriter(filename);
			for (String irLine : inputIR) {
				if (!irLine.equals("\n")) {
					writer.write(cleanUp(emit(irLine)));
				}
			}
			
			writer.close();
		} catch (IOException e) {
			System.out.println("ERROR: Writing IR to file failed!");
			return false;
		} 
		
		return true;
	}
	
	private static String cleanUp(String input) {
		return input.replaceAll("\n\n+", "\n");
	}
	
	public static String emit(String input) {
		return input + "\n";
	}
	
	/**
	 * Emits a label given a label ID (appends a colon and space).
	 * 
	 * @param label An input label ID.
	 * @return A label to insert into IR.
	 */
	public static String emitL(String label) {
		return label + ": ";
	}
	
	/**
	 * Generates a unique loop label based on a given Object's hashcode.
	 * 
	 * @param obj A given Object to generate a hashcode based on.
	 * @return A unique loop label.
	 */
    /*
	public static String generateCondLabel(Object obj) {
		return "loop_" + String.valueOf(obj.hashCode()).substring(
				String.valueOf(obj.hashCode()).length() / 2, 
				String.valueOf(obj.hashCode()).length());
				}*/
}
