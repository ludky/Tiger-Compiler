import java.util.*;

public class BasicBlock{

    private int id;
    private String label;
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
	this(block, id, "null");
    }

    public BasicBlock(ArrayList<String> block, int id, String label) {
	this.block = block;
	this.id = id;
	this.label = label;
	nextBlock = new LinkedList<BasicBlock>();
    }

    public ArrayList<BasicBlock> getNext() {
	return nextBlock;
    } 

    public void setBlockId(int id) {
	this.id = id;
    }

    public void setNextBlock(int next){
	nextBlock.add(next);
    }

    public void getNext(){
	return nextBlock;
    }

}
