import java.util.*;

public class BasicBlock{

    private int id;
    private List<String> block;
    private List<BasicBlock> nextBlock;
    //private BasicBlock prevBlock;
    private List<streamInOut> instructions;
    private List<String> in_var;
    private List<String> out_var;

    public BasicBlock(LinkedList<String> block) {
	this(block, 0);
    }

    public BasicBlock(LinkedList<String> block, int id) {
	this.block = block;
	this.id = id;
	nextBlock = new LinkedList<BasicBlock>();
    }

    public LinkedList<BasicBlock> getNext() {
	return nextBlock;
    } 

    public void setBlockId(int id) {
	this.id = id;
    }

    public 

}
