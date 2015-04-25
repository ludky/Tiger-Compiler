import java.util.*;
import java.lang.*;
import java.util.regex.*;

public class CFG {

    private List<String> ir_code;
    //  private BasicBlock head;
    private List<String> leader;
    private ArrayList<BasicBlock> blocks;

    public CFG(ArrayList<String> ir_code) {
	this.ir_code = ir_code;
	//head = new BasicBlock();
	blocks = new ArrayList<BasicBlock>();
	leader = new ArrayList<String>();
	//generateBasicBlock();
	//generateCFG();
    }

    public void generateBasicBlock() {

	//first is natually one of the entry point of a basic block
	//leader.add(ir_code.get(0)) ;
	List<String> block = new ArrayList<String>();
	int blockId = 0;	//blockId should match the idx of block in the arraylist
       //	block.add(ir_code.get(0));
	boolean newBlock = false;
	String label = "null";
	String prev = "";
	boolean isLabel = false;
	//int forward = 0;

	//int curIdx
        for(String ins: ir_code) {
	
	if(containLabel(ins)) {
		//noDupAdd(ins, block);
		//block.add(ins);
		//newBlock = true; //indicate next is a leader
		//	leader.add(ins);
	} 

	    if(newBlock) {
		blocks.add(new BasicBlock(block, blockId));
		block = new ArrayList<String>();
		blockId++;
		noDupAdd(ins, block);
		//block.add(ins);
		newBlock = false;
	    }

	    if(isBranchReturn(ins)) { //check branch first to make sure not messing up with label
		//block.add(ins);
		noDupAdd(ins, block);
		newBlock = true; //indicate next is a leader
	    } else if(containLabel(ins)) {
		newBlock = true; //indicate next is a leader
		
	    } else {
		//block.add(ins);
	}
		//noDupAdd(ins, block);
	  	//block.add(ins); //entry may be a label
	}
	
    }

	public void noDupAdd(String ins, List<String> block) {
		if (block.size()==0)
			block.add(ins);
		if(!block.get(block.size()-1).equals(ins))
			block.add(ins);
	}

    public void generateCFG() {

	for(BasicBlock b: blocks) {
	    List<String> block = b.getBlockList();
	    String lastLine = block.get(block.size()-1);
	    int id = b.getBlockId();
	    if(!lastLine.contains("goto,") || !lastLine.contains("return,") && id < blocks.size() - 1) { //check if last is not goto nore return nor last blocks
		b.setNextBlock(id + 1);
		blocks.get(id+1).setPrevBlock(id);
	    }
	}

	for(BasicBlock b: blocks) {
	    List<String> block = b.getBlockList();
	    String lastLine = block.get(block.size()-1);
	    if(isBranchReturn(lastLine)) {
		for (BasicBlock r: blocks) {
		    List<String> toCompare = r.getBlockList();
		    String firstLine = toCompare.get(0);
		    if(containLabel(firstLine)) {
			if(getLabel(lastLine).equals(firstLine)) {
			    b.setNextBlock(r.getBlockId());
			    r.setPrevBlock(b.getBlockId());
			}
		    }
		}
	    }
	}
	

    }


    private String getLabel(String ins) {
	String[] insA = ins.split("\\s*,\\s*");
	String label = "";
	if(insA[0].equals("return") || insA[0].equals("goto")) {
	    label = insA[1];
	} else {
	    label = insA[3];
	}
	return (label+":");
    }



    private boolean isBranchReturn(String ins) {
	if(ins.contains("goto,") || ins.contains("breq,") || ins.contains("brneq,")
	   ||ins.contains("brlt,") || ins.contains("brgt,") || ins.contains("brgeq,")
	   || ins.contains("brleq,") || ins.contains("return,")) {
	    return true;
	}
	return false;
    }

    private boolean containLabel(String ins) {
	//check "label#:", "main:"
	return Pattern.matches("(main|label[0-9]+):*" , ins);
    }

    public List<String> getLeader() {
	return leader;
    }

    public List<BasicBlock> getBlockList() {
	return blocks;
    }

    //   public 
    
}
