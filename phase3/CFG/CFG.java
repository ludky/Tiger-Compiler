import java.util.*;

public class CFG {

    private List<String> ir_code;
    //  private BasicBlock head;
    private List<String> leader;
    private ArrayList<BasicBlock> blocks;

    public CFG(ArrayList<String> ir_code) {
	this.ir_code = ir_code;
	head = new BasicBlock();
	leader = new ArrayList<String>();
    }

    public void generateBasicBlock() {

	//first is natually one of the entry point of a basic block
	leader.add(ir_code.get(0)) ;
	List<String> block = new ArrayList<String>();
	int blockId = 0;	
       	block.add(ir_code.get(0));
	boolean newBlock = false;
	String label = "null";

	//int curIdx
        for(String ins: ir_code) {
	    
	    if(newBlock) {
		blocks.add(new BasicBlock(block, blockId));
		block.clear();
		blockId++;
		leader.add(ins);
		//	block.add(ins);
		newBlock = false;
	    }

	    if(isBranchReturn(ins)) { //check branch first to make sure not messing up with label
		block.add(ins);
		newBlock = true; //indicate next is a leader
	    } else if(containLabel(ins)) {
		newBlock = true; //indicate next is a leader
		//	leader.add(ins);
	    } else {
		block.add(ins);
	    }
	    

	}
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
	return Pattern.matches("[label][0-9]+:*" , ins);
    }

    public ArrayList<String> getLeader() {
	return leader;
    }

    public ArrayList<BasicBlock> getBlockList() {
	return blocks;
    }

    public 
    
}
