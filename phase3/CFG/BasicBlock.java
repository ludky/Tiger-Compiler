package p3;

import java.util.*;

public class BasicBlock{

    private int id;
    // private String label;
    private List<Instruction> block;
    private List<Integer> nextBlock, prevBlock;
   // private List<streamInOut> instructions;
    private List<String> in_var;
    private List<String> out_var;

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
