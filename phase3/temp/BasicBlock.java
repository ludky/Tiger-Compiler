//package p3;

import java.util.*;

public class BasicBlock{

    private int id;
    // private String label;
    private List<Instruction> block;
    private List<Integer> nextBlock, prevBlock;
    private List<StreamInOut> instructions;
   // private List<String> in_var; // same as the in set of first line
    //private List<String> out_var; //same as the out set of last line

    public BasicBlock() {
    	this(null, 0);
    }

    public BasicBlock(List<Instruction> block) {
    	this(block, 0);
    }


    public BasicBlock(List<Instruction> block, int id) {
    	this.block = block;
    	this.id = id;
    	nextBlock = new ArrayList<>();
    	prevBlock = new ArrayList<>();
	instructions = new ArrayList<StreamInOut>();
	initializeStream(block, instructions);
	findInOut();
    }

    public findInOut() {
	
    }

    private void initializeStream(List<Instruction> block, List<StreamInOut> instrucions) {
	for(Instruction ins: block) {
	    instructions.add(new StreamInOut(ins));	    
	}
    }

    public void setBlockId(int id) {
    	this.id = id;
    }

    public int getBlockId() {
    	return id;
    }

    public void addNextBlock(int next){
    	nextBlock.add(next);
    }

    public List<Integer> getNext(){
    	return nextBlock;
    }

    public void addPrevBlock(int prev) {
    	prevBlock.add(prev);
    } 

    public List<Integer> getPrev() {
    	return prevBlock;
    }

    public List<Instruction> getBlockList() {
    	return block;
    }

    public List<StreamInOut> getLivenessList() {
	return instructions;
    }

    public String toString() {
    	String ans = "Block ID: " + id + "; Next Block(s): ";
    	for (Integer i : nextBlock) {
    		ans += i + " ";
    	}
    	ans += "; Prev Block(s): ";
    	for (Integer j : prevBlock) {
    		ans += j + " ";
    	}
    	for (Instruction c : block) {
    		ans += "\n" + c;
    	}
    	return ans;
    }
}
