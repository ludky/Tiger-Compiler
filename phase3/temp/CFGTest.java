//package p3;
import java.util.*;
import java.nio.file.*;
import java.nio.*;
import java.nio.charset.Charset;

import java.util.ArrayList;

public class CFGTest {
    public static void main(String[] args) {

	/*try {
	List<String> content = Files.readAllLines(Paths.get("/home/lu/Desktop/CFG/test.text"), Charset.defaultCharset());
	ArrayList<String> test = new ArrayList<String>(content);
	CFG cfg = new CFG(test);
	cfg.generateBasicBlock();
	cfg.generateCFG();
	List<BasicBlock> blist =  cfg.getBlockList();
	for(BasicBlock b: blist) {
		System.out.println("basic block: " + b.getBlockId());
		System.out.println("prev idx:  " + b.getPrev());
		System.out.print("next: ");
		if(b.getNext() != null) {
			//System.out.print("next: ");
			for(int n : b.getNext()) {
				System.out.print(" " + n);
			}
				System.out.println();
		} else {
			System.out.print("null");
		}
		//System.out.println("basic block: " + b.getBlockId());
		List<String> block = b.getBlockList();
		for(String s: block) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
	}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}*/

/*
    	Label l1 = new Label();
    	Label l2 = new Label();
    	Label l3 = new Label();
    	Label l4 = new Label();
    	ArrayList<Instruction> ins = new ArrayList<>();
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Branch("brlt", new Temp(), new Temp(), l1));
    	ins.add(new Assignment(new Temp(), new Temp()));
    	ins.add(new InsLabel(l1));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Goto(l3));
    	ins.add(new InsLabel(l2));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new InsLabel(l3));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new Branch("brlt", new Temp(), new Temp(), l4));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	ins.add(new InsLabel(l4));
    	ins.add(new Binary("add", new Temp(), new Temp(), new Temp()));
    	for (Instruction s : ins) {
    		System.out.println(s);
    	}
    	System.out.println();
    	CFG temp = new CFG(ins);
    	temp.generateBasicBlock();
    	temp.generateCFG();	
    	System.out.println(temp);
*/


try {
	List<String> content = Files.readAllLines(Paths.get("/home/lu/Desktop/CFG/test.text"), Charset.defaultCharset());
	ArrayList<String> test = new ArrayList<String>(content);

	StringToInstruction si = new StringToInstruction(test);
	ArrayList<Instruction> te = si.getInstructionList();

	CFG varTest = new CFG(te);
    	varTest.generateBasicBlock();
    	varTest.generateCFG();	
    	//System.out.println(varTest);
	List<BasicBlock> block = varTest.getBlockList();
	for(BasicBlock b: block) {
		//System.out.println(s.instruction());
		for(StreamInOut sio: b.getLivenessList()) {
			System.out.println(sio.instruction());
		}
	}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	





    }
}
