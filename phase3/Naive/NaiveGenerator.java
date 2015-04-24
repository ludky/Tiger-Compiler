import java.util.*;

public class NaiveGenerator {

    private List<String> ir_code;
    private List<String> naive_code;
    //  private List<String> regs;
    private Map<Register, String> regs;
    private static final int WORD_SIZE = 4;
    private List<String> misp_code;

    public NaiveGenerator(ArrayList<String> ir_code) {
	this.ir_code = ir_code;
	naive_code = ArrayList<String>();
	//regs = new ArrayList<String>();
	regs = new HashMap<Register, String>();
	misp_code = new ArrayList<String>();
	initializeReg(regs);
    }

    public initializedReg(Map<Register, String> regs) {
	//define needed int register
	regs.add(new Register("$zero", Register.regType.INT), "0");
	regs.add(new Register("$v0", Register.regType.INT), "");
	regs.add(new Register("$v1", Register.regType.INT), "");
	regs.add(new Register("$t0", Register.regType.INT), "");
	regs.add(new Register("$t1", Register.regType.INT), "");
	regs.add(new Register("$t2", Register.regType.INT), "");
	regs.add(new Register("$t3", Register.regType.INT), "");
	regs.add(new Register("$t4", Register.regType.INT), "");
	regs.add(new Register("$t5", Register.regType.INT), "");
	regs.add(new Register("$t6", Register.regType.INT), "");
	regs.add(new Register("$t7", Register.regType.INT), "");
	regs.add(new Register("$s0", Register.regType.INT), "");
	regs.add(new Register("$s1", Register.regType.INT), "");
	regs.add(new Register("$s2", Register.regType.INT), "");
	regs.add(new Register("$s3", Register.regType.INT), "");
	regs.add(new Register("$s4", Register.regType.INT), "");
	regs.add(new Register("$s5", Register.regType.INT), "");
	regs.add(new Register("$s6", Register.regType.INT), "");
	regs.add(new Register("$s7", Register.regType.INT), "");
	regs.add(new Register("$sp", Register.regType.INT), "");
	regs.add(new Register("$fp", Register.regType.INT), "");

	//define needed float register
	for(int i = 0; i < 32; i++) {
	    regs.add(new Register("$f"+Integer.toString(i), Register.regType.FLOAT), "");
	}

    }


    public void ir_to_misp() {
	for(String ir: ir_code) {
	    naiveTranslator(ir);
	}
	misp_code = //;
	
    }
    public void allocateMem() {

	//reserved
    }

    public void formatIR() {

       	List<String> ins = new ArrayList<String> ;
	for(String ir: ir_code) {
	    if(ir.contains("assign")) {
		ins = formatIns(ir);
		if(ir.contains(","+EOF)) { //assign a:=b -> store a with val b
		    
		} else { //assign array store

		}

	    } else if(ir.contains("call")) { //call, func, x -> load x

	    } else if(ir.contains("callr")) { //callr, a, func, x, y, z... -> load x, y, z... store a

	    } else if(ir.contains("array_load")) { //array_load, a, arr, 0 -> load

	    } else if(ir.contains("array_store")) { // array_store, arr, 0, a

	    } else if(ir.contains("")) {

	    } else if(ir.contains("")) {

	    } else if(ir.contains("")) {

	    } else if(ir.contains(""))
	}
    }

    public List<String> formatIns(String ins) {
	//	List<String> list = new ArrayList<String>();
	//	list = Arrays.asList(ins.split("\\s*,\\s"));
	return Arrays.asList(ins.split("\\s*,\\s"));
    }

    public String load_store (String op, String sr, String des) {
	String split = ", ";

	return op + " " + des+split+sr;
    }

    /*
    public String sw(String sr, String des) {
	String op = "sw";
	String split = ", ";
	return op + sr + split + des;
    }

    public String lw(String sr, String des) {
	String op = "lw";
	String split = ", ";
	return op + sr + split + des;
	
    }
    */
    public void 

    

}
