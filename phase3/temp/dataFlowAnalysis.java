import java.util.*;

public class dataFlowAnalysis {
	
	//private boolean isChanged = false;
	// algorithms between instruction

	/*    in[I] = (out[I] - def[I]) U use[I]      */
	/*
	public Set<Variable> insInFromOut(InsInOut ins) {
	//	isChanged = true;
		Set<Variable> in = addToSet(removeFromSet(ins.getOut(), ins.getDef()) , ins.getUse());
	//	isChanged = ins.replaceIn(in);
		return in;
	}
	*/


	public boolean insInFromOut(InsInOut ins) {
		boolean isChanged = false;
		Set<Variable> in = addToSet(removeFromSet(ins.getOut(), ins.getDef()) , ins.getUse());
		isChanged = ins.replaceIn(in);
		return isChanged;
	}


	private Set<Variable> addToSet(Set<Variable> set, Set<Temp> toAdd) {
		boolean isChanged = false;
		for(Temp t: toAdd) {
			if (set.add(new Variable(t))) {
				isChanged = true;
			}
		}
		return set;
	}

	private Set<Variable> removeFromSet(Set<Variable> set, Set<Temp> toRemove) {
		boolean isChanged = false;
		if(set != null) {	
			for(Temp t: toRemove) {
				Variable v = new Variable(t);

				//if(set.contains(v)) {
				if(set.remove(t)) {
					ifChanged = true;
				}
				//}
			}
		}
		return set;
	}

	//algorithms within block
	public void blockLiveness(ArrayList<InsInOut> instruction) {
		int n = instruction.size();
		Boolean isChanged = ture;
		Set<Variable> prevIn = new Set<Variable>();
		while(isChanged) {
			isChanged = false;
		for(int i = n - 1; i >=0; i--) {
				InsInOut cur = instruction.get(i);
				if (i < n - 1) {
					if(cur.replaceOut(prevIn)) {
						ifChanged = true;
					}
				}
					if(insInFromOut(cur)) {
						isChanged = true;
						prevIn = cur.getIn();
					}
				//prevIn = insInFromOut(cur);
			}
		}
	}

	public boolean oneTimeTraversal(ArrayList<InsInOut> instructon, boolean isChanged) {
		int n = instruction.size();
		isChanged = false;
		Set<Variable> prevIn = new Set<Variable>();

		for(int i = n - 1; i >=0; i--) {
				InsInOut cur = instruction.get(i);
				if (i < n - 1) {
					if(cur.replaceOut(prevIn)) {
						ifChanged = true;
					}
				}
				if(insInFromOut(cur)) {
					isChanged = true;
					prevIn = cur.getIn();
				}
		}
		return isChanged;
	}

	// algorithms between block
	public void allBlocksLiveness(ArrayList<BasicBlock> blocks) {
		//if(block.getNext() == null) { //this is the base case when we find the last block
			
		//}

	}

	private Set<Variable> recursivelyLiveAnalysis(ArrayList<BasicBlock> blocks, BasicBlock block, boolean isChanged) {

		ArrayList<InsInOut> ins = block.getLivenessList();
		if(block.getNext() == null) { //this is the base case when we find the last block
			//ArrayList<InsInOut> ins = block.getLivenessList();	//get the InsInOut list
			isChanged = oneTimeTraversal(ins, isChanged);
			//return ins.get(0).getIn(); // the in set of block is the in set of first instruction, and it is also the out set of previous block so return it.
		} /*else {
			
		}*/
			else {
		//ArrayList<InsInOut> ins = block.getLivenessList();
		lastIns = ins.get(ins.size()-1); //last instruction of the block
		Set<Variable> newSet = new HashSet<Variable>();
		for(int idx: block.getNext()) {
			//isChanged = lastIns.replaceOut(unionTwoSets(lastIns.get));
			unionTwoSets(newSet, recursivelyLiveAnalysis(blocks, blocks.get(idx), isChanged));
			isChanged = lastIns.replaceOut(newSet);
		}
			isChanged = oneTimeTraversal(ins, isChanged);

			//return ins.get(0).getIn();
		}
		return ins.get(0).getIn();
	}

	private Set<Variable> unionTwoSets(Set<Variable> a, Set<Variable> b, boolean isChanged) {
	//	boolean isChanged = false;
		Set<Variable> toReturn = new HashSet<Variable>();
        for(Variable v: a) {
            if(!this.b.contains(v)) {
                isChanged = true;
            }
			toReturn.add(v);
        }
        for(Variable v: b) {
            if(!a.contains(v)) {
                isChanged = true;
            }
			toReturn.add(v);
        }
		return toReturn;
	}

}
