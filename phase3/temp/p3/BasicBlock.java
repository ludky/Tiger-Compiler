package p3;

import java.util.*;

public class BasicBlock{

    private int id;
    // private String label;
    private List<Instruction> block;
    private List<Integer> nextBlock, prevBlock;
    private List<InsInOut> instructions;

	private Map<Temp, Integer> intraNum;
	private Set<Temp> highCostTemp;
	private Set<Temp> lowCostTemp;
	private final static int MAX_REG = 16;
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
		intraNum = new HashMap<Temp, Integer>();
		instructions = new ArrayList<InsInOut>();
		initializeStream(block, instructions);
		highCostTemp = new HashSet<Temp>();
		lowCostTemp = new HashSet<Temp>();
		getIntraOrder(instructions, intraNum);
		findHighCostTemp();

    }

    public Map<Temp, Integer> getIntraOrder(List<InsInOut> ins, Map<Temp, Integer> intraNum) {
		for(InsInOut iio: ins) {
			for(Temp temp: iio.getDef()) {
				if(intraNum.containsKey(temp)) {
					intraNum.put(temp, (intraNum.get(temp) + 1));				
				} else {
					intraNum.put(temp, 1);
				}
			}

			for(Temp temp: iio.getUse()) {
				if(intraNum.containsKey(temp)) {
					intraNum.put(temp, (intraNum.get(temp) + 1));				
				} else {
					intraNum.put(temp, 1);
				}
			}
		}
		return intraNum;
	}

	private void findHighCostTemp() {
		if(intraNum.size()<=16) {
			highCostTemp = intraNum.keySet();
		} else {
			int count = MAX_REG;
			for(Temp temp: intraNum.keySet()) {
				int numberOfGreater = 0;
				for(Temp toCompare: intraNum.keySet()) {
					if(!temp.equals(toCompare)) {
						numberOfGreater += ( ( intraNum.get(temp) < intraNum.get(toCompare) )?1:0);
					}
				}
				if(numberOfGreater <= count) {
					highCostTemp.add(temp);
					count--;
				} else {
					lowCostTemp.add(temp);
				}
				
			}
		}		
	}



    private void initializeStream(List<Instruction> block, List<InsInOut> instrucions) {
	for(Instruction ins: block) {
	    instructions.add(new InsInOut(ins));	    
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

    public List<InsInOut> getLivenessList() {
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
