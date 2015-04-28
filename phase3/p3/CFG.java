package p3;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class CFG {

    private List<Instruction> ir_code;
    //  private List<String> leader;
    private ArrayList<BasicBlock> blocks;
    private dataFlowAnalysis da;
    private ArrayList<String> list;

    public CFG(ArrayList<Instruction> ir_code) {
	list = new ArrayList<String>();
    	this.ir_code = ir_code;
    	blocks = new ArrayList<BasicBlock>();
	//	leader = new ArrayList<String>();
	generateBasicBlock();
	generateCFG();
	//printReg();
	//	generatePrintingList();
	//	printReg();
	da = new dataFlowAnalysis(blocks);
	generatePrintingList();	

      	mergePrinting(da.getArrayList());
    }

    public ArrayList<String> getList() {
	return list;
    }

    private void mergePrinting(ArrayList<String> dfa) {
	for(String s: dfa) {
	    list.add(s);
	}
    }

    public void generateBasicBlock() {
    	List<Instruction> block = new ArrayList<>();
    	int blockId = 0;
        block.add(ir_code.get(0));
        boolean newBlock = false;
        for(int i = 1; i < ir_code.size(); i++) {
	    Instruction ins = ir_code.get(i);
	    if (ins instanceof Branch /*|| ins instanceof Return || ins instanceof Goto*/) {
		newBlock = true;
	    } else if (ins instanceof InsLabel) {
		if(!(ir_code.get(i-1) instanceof Branch  || ir_code.get(i-1) instanceof Return || ins instanceof Goto )) {
		    blocks.add(new BasicBlock(block, blockId));
		    block = new ArrayList<Instruction>();
		    blockId++;
		}
	    }
	    block.add(ins);
	    if(newBlock) {
		blocks.add(new BasicBlock(block, blockId));
		block = new ArrayList<Instruction>();
		blockId++;
		newBlock = false;
	    }
        }
        blocks.add(new BasicBlock(block, blockId));
    }
    
    public void generateCFG() {
    	for(BasicBlock b: blocks) {
	    List<Instruction> block = b.getBlockList();
	    Instruction lastLine = block.get(block.size() - 1);
	    int id = b.getBlockId();
	    if(!(lastLine instanceof Goto) && !(lastLine instanceof Return)
	       && id < blocks.size() - 1) {
		b.addNextBlock(id + 1);
		blocks.get(id+1).addPrevBlock(id);
	    }
    	}

    	for(BasicBlock b: blocks) {
	    List<Instruction> block = b.getBlockList();
	    Instruction lastLine = block.get(block.size()-1);

	    if (lastLine instanceof Return || lastLine instanceof Branch
		|| lastLine instanceof Goto) {
		Label lb = null;
		if (lastLine instanceof Return) {
		    Return curr1 = (Return) lastLine;
		    lb = curr1.label;
		} else if (lastLine instanceof Branch ){
		    Branch curr2 = (Branch) lastLine;
		    lb = curr2.label;
		} else {
		    Goto curr3 = (Goto) lastLine;
		    lb = curr3.label;
		}
		for (BasicBlock r: blocks) {
		    Instruction firstLine = r.getBlockList().get(0);
		    if(firstLine instanceof InsLabel) {
			if(firstLine.equals(new InsLabel(lb))) {
			    b.addNextBlock(r.getBlockId());
			    r.addPrevBlock(b.getBlockId());
			}
		    }
		}
	    }
    	}
    }


    public void printUseDef() {

	list.add("------------------------use def set--------------------------------");
	for(BasicBlock bb: blocks) {
	    for(InsInOut sio: bb.getLivenessList()) {
		list.add((" For:  -- " +  sio.instruction() + " --"));
		list.add("Def set: ");
		String s = "";
		for(Temp t: sio.getDef()) {
		    s += ("  " + t.toString());
		}
		list.add(s);
		list.add("Use set: ");
		s = "";
		for(Temp t: sio.getDef()) {
		    s += ("  " + t.toString());
		}
		list.add(s);	
	    }
	    list.add("");
	}
	list.add("----------------------end use def set-----------------------------");

    }







    public void printReg() {

	    
	//	System.out.println("------------intra-block Reg allocation-------------");
	list.add("----------------------intra-block Reg allocation--------------------------------");
	for(BasicBlock bb: blocks) {
	    
	    list.add(("Block  "  + bb.getBlockId()));


	    //	System.out.println("Block  "  + bb.getBlockId());
	    HashMap<Temp, String> maps = mapReg(bb.highCostTemp());
	    for(Temp t: (Set<Temp>)maps.keySet()) {
		list.add(("Variable " + t.toString() + "  assigned register " + maps.get(t)));
		//	System.out.println("Variable " + t.toString() + "  assigned register " + maps.get(t));
	    }
	    //	System.out.println("Below are the variable not assigned due to the low cost");
	    list.add("Below are the variable not assigned due to the low cost (required load and store operation)");
	    String lowCost = "";
	    for(Temp t: bb.lowCostTemp()) {
		lowCost += (t.toString() + "   ");
		//	System.out.print(t.toString() + "   " );
		// list.add((t.toString() + "   "));
	    }
	    list.add(lowCost);
	    list.add("");
	   
	    //	System.out.println();
	}
	 list.add("--------------------- end intra-block Reg allocation---------------------------");

    }

    public HashMap<Temp, String> mapReg(Set<Temp> temps) {
	    
	HashMap<Temp, String> maps = new HashMap<Temp, String>();
	int count = 0;
	String prefix = "$t";
	for(Temp t: temps) {
	    maps.put(t, (prefix + Integer.toString(count)));
	    count++;
	}

	return maps;
    }

    public List<BasicBlock> getBlockList() {
    	return blocks;
    }   

    public void printInOut() {
	list.add("---------------------------in out result--------------------------------");
	for(BasicBlock b: blocks) {
	    for(InsInOut sio: b.getLivenessList()) {
		list.add(("For:  " +sio.instruction()));
		list.add("In set:");
		String s = "";
		for(Variable t: sio.getIn()) {
		    s += ("  " + t.toString());
		}
		list.add(s);
		list.add("Out set: ");
		s = "";
		for(Variable t: sio.getOut()) {
		    s += ("  " + t.toString());
		}
		list.add(s);
	    }
	    list.add("");
	}
	list.add("-----------------------end in out result--------------------------------");

    }

    public ArrayList<String> generatePrintingList() {
	list.add("-----------------------------basic block-------------------------------");
	for(BasicBlock bb: blocks) {
	    list.add(bb.toString());
	}
	list.add("-----------------------------end basic block----------------------------");

	printReg();
	printUseDef();
	printInOut();
	return list;
    }

    public String toString() {
    	String ans = "";
    	for (BasicBlock a : blocks) {
	    ans += a + "\n";
    	}
    	return ans;
    }
}
