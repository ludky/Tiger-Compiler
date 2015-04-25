//package p3;

import java.util.List;
import java.util.ArrayList;

public class CFG {

    private List<Instruction> ir_code;
    private List<String> leader;
    private ArrayList<BasicBlock> blocks;

    public CFG(ArrayList<Instruction> ir_code) {
    	this.ir_code = ir_code;
    	blocks = new ArrayList<BasicBlock>();
    	leader = new ArrayList<String>();
    }
/*
	public CFG(ArrayList<String> strings, String s) {
		//StringToInstruction si = new StringToInstruction(strings);
		//this(si.getInstructionList());
		//this((new StringToInstruction(strings)).convert(strings));
		this(StringToInstruction.convert(strings));
	}
*/
    public void generateBasicBlock() {
    	List<Instruction> block = new ArrayList<>();
    	int blockId = 0;
        block.add(ir_code.get(0));
        boolean newBlock = false;
        for(int i = 1; i < ir_code.size(); i++) {
        	Instruction ins = ir_code.get(i);
        	if (ins instanceof Branch || ins instanceof Return) {
        		newBlock = true;
        	} else if (ins instanceof InsLabel) {
        		if(!(ir_code.get(i-1) instanceof Branch || ir_code.get(i-1) instanceof Return)) {
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

    public List<String> getLeader() {
    	return leader;
    }

    public List<BasicBlock> getBlockList() {
    	return blocks;
    }   

    public String toString() {
    	String ans = "";
    	for (BasicBlock a : blocks) {
    		ans += a + "\n";
    	}
    	return ans;
    }
}
