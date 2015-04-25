import java.util.*;

public class BasicBlock{

    private int id;
    // private String label;
    private List<String> block;
    private List<int> nextBlock;
    private int prevBlock;
    private List<streamInOut> instructions;
    private List<String> in_var;
    private List<String> out_var;

    public BasicBlock() {
	this(null, 0)
    }

    public BasicBlock(ArrayList<String> block) {
	this(block, 0);
    }


    public BasicBlock(ArrayList<String> block, int id) {
	this.block = block;
	this.id = id;
	//	this.label = label;
	nextBlock = new LinkedList<int>();
	prevBlock = -1;
    }

    public ArrayList<BasicBlock> getNext() {
	return nextBlock;
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

    public void getNext(){
	return nextBlock;
    }

    public void setPrevBlock(int prev) {
	prevBlock = prev;
    } 

    public int getPrevBlock() {
	return prevBlock;
    }

    public List<String> getBlockList() {
	return block;
    }

}
