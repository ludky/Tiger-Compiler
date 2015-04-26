package p3;
import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.nio.charset.Charset;

import java.util.ArrayList;

public class liveTest {
    public static void main(String[] args) {


try {
	List<String> content = Files.readAllLines(Paths.get("/home/lu/Desktop/CFG/p3/test1.text"), Charset.defaultCharset());
	ArrayList<String> test = new ArrayList<String>(content);
	
	StringToInstruction si = new StringToInstruction(test);
	ArrayList<Instruction> te = si.getInstructionList();
/*
	for(Instruction ins : te) {
			//System.out.println("instruction list");
			System.out.println(ins);
	}
*/
	System.out.println("---------------basic block cfg-----------------");

	CFG varTest = new CFG(te);
    	varTest.generateBasicBlock();
    	varTest.generateCFG();

		
    	System.out.println(varTest);

		System.out.println();
		System.out.println("---------------use def set-----------------");

	List<BasicBlock> block = varTest.getBlockList();
		dataFlowAnalysis da = new dataFlowAnalysis();
/*
	for(int i = block.size() - 1; i >=0; i-- ) {
		BasicBlock bb = block.get(i);
	//	System.out.println(bb.getBlockId());
		List<InsInOut> iiol = bb.getLivenessList();

		
		da.oneTimeTraversal(iiol , true);
	}
*/

	da.allBlocksLiveness(block);

System.out.println("---------------in out result--------------------------------");


	for(BasicBlock b: block) {
		//System.out.println(s.instruction());
		
		for(InsInOut sio: b.getLivenessList()) {
			System.out.println(sio.instruction());
			sio.printInOut();
		}
	}

	System.out.println();
	System.out.println("-------------------------live analysis----------------");

	}

	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	



    }
}
