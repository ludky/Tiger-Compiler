import java.util.*;

public class BasicBlock{

    private int id;
    // private String label;
    private List<String> block;
    private List<Integer> nextBlock;
    private int prevBlock;
   // private List<streamInOut> instructions;
    private List<String> in_var;
    private List<String> out_var;

    public BasicBlock() {
	this(null, 0);
    }

    public BasicBlock(List<String> block) {
	this(block, 0);
    }


    public BasicBlock(List<String> block, int id) {
	this.block = block;
	this.id = id;
	//	this.label = label;
	nextBlock = new LinkedList<Integer>();
	prevBlock = -1;
    }

    public void setBlockId(int id) {
	this.id = id;
    }

    public int getBlockId() {
	return id;
    }

    public void setNextBlock(int next){
	nextBlock.add(next);
    }

    public List<Integer> getNext(){
	return nextBlock;
    }

    public void setPrevBlock(int prev) {
	prevBlock = prev;
    } 

    public int getPrev() {
	return prevBlock;
    }

    public List<String> getBlockList() {
	return block;
    }

}
