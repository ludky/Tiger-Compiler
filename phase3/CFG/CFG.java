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
	int blockId = 0;	//blockId should match the idx of block in the arraylist
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
		//	block.add(ins);
		newBlock = true; //indicate next is a leader
	    } else if(containLabel(ins)) {
		newBlock = true; //indicate next is a leader
		//	leader.add(ins);
	    } else {
		//	block.add(ins);
	    }
	    block.add(ins); //entry may be a label
	}
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
	return Pattern.matches("[label][0-9]+:*" , ins);
    }

    public ArrayList<String> getLeader() {
	return leader;
    }

    public ArrayList<BasicBlock> getBlockList() {
	return blocks;
    }

    //   public 
    
}
