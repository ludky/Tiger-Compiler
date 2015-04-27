package p3;
import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.nio.charset.Charset;

import java.util.ArrayList;

public class liveTest {
    public static void main(String[] args) {


try {
/*****************************************************************************************************************************/

	List<String> content = Files.readAllLines(Paths.get("/home/lu/Desktop/CFG/p3/test1.text"), Charset.defaultCharset());
	ArrayList<String> test = new ArrayList<String>(content);
	
	StringToInstruction si = new StringToInstruction(test);

	ArrayList<Instruction> te = si.getInstructionList();
/**************************************************************************************************************************/
/*change the above !!!! above part take in text file and translate it to ArrayList of instruction. only for test use!!!!*/






	System.out.println("---------------basic block cfg-----------------");



	CFG varTest = new CFG(te);
    	varTest.generateBasicBlock();
    	varTest.generateCFG();
    	System.out.println(varTest);
		varTest.printReg();

		List<BasicBlock> block = varTest.getBlockList();
		dataFlowAnalysis da = new dataFlowAnalysis(block);

		da.allBlocksLiveness(block);
		da.printAll(block);

}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	



    }
}
