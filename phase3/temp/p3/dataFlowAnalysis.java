package p3;
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
		Set<Variable> in = addToSet(removeFromSet(ins.getOut(), ins.getDef(), isChanged) , ins.getUse(),isChanged);
		if(ins.replaceIn(in)) {
			isChanged = true;			
		}
		System.out.println("replace in");
		ins.printInOut();
		return isChanged;
	}


	private Set<Variable> addToSet(Set<Variable> set, Set<Temp> toAdd, boolean isChanged) {
		Set<Variable> nSet = new HashSet<Variable>();
	
		//boolean isChanged = false;
		for(Variable v: set) {
			nSet.add(v);
		}
		for(Temp t: toAdd) {
			if (nSet.add(new Variable(t))) {
				isChanged = true;
			}
		}
		return nSet;
	}

	private Set<Variable> removeFromSet(Set<Variable> set, Set<Temp> toRemove, boolean isChanged) {
		//System.out.println("out[I] - def[I]");
		
		Set<Variable> nSet = new HashSet<Variable>();
		for(Variable v: set) {
			if(!toRemove.contains(v.name())) {
				nSet.add(v);
			} else {
				isChanged = true;
			}
		}

		/*

		boolean isChanged = false;
		if(set != null) {	
			for(Temp t: toRemove) {
				Variable v = new Variable(t);

				if(set.contains(v)) {
				if(set.remove(t)) {
					isChanged = true;
				}
				}
			}
		}
		//printSet(set);
		return set;

	*/

	return nSet;
	}

	private void printSet(Set<Variable> set) {
		System.out.print("   set: ");
	for(Variable v: set) {
		System.out.print("  " + v.toString());
	}
	System.out.println();
	}

	//algorithms within block
	public void blockLiveness(ArrayList<InsInOut> instruction) {
		int n = instruction.size();
		Boolean isChanged = true;
		Set<Variable> prevIn = new HashSet<Variable>();
		while(isChanged) {
			isChanged = false;
		for(int i = n - 1; i >=0; i--) {
				InsInOut cur = instruction.get(i);
				if (i < n - 1) {
					if(cur.replaceOut(prevIn)) {
						isChanged = true;
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

	public boolean oneTimeTraversal(List<InsInOut> instruction, boolean isChanged) {
		//System.out.println(instruction);
		int n = instruction.size();
		isChanged = false;
		Set<Variable> prevIn = new HashSet<Variable>();

		for(int i = n - 1; i >=0; i--) {
				InsInOut cur = instruction.get(i);
				System.out.println("   " +cur.instruction());
				//cur.printInOut();
				if (i < n - 1) {
					System.out.println("replacing out: " );
					//printSet(prevIn);
					if(cur.replaceOut(prevIn)) {
						isChanged = true;
					}
				}
				cur.printInOut();
				if(insInFromOut(cur)) {
					isChanged = true;
					System.out.println(" cur in   "  );
					//printSet(cur.getIn());
					prevIn = cur.getIn();
				}
				cur.printInOut();
		}
		return isChanged;
	}






	// algorithms between block


	public void allBlocksLiveness(List<BasicBlock> blocks) {
			boolean	isChanged = true;
			int counting = 0;
			while(counting < 10) {
				System.out.println("runing at: " + counting);
				counting ++;

				for(int i = blocks.size()-1;i>=0;i--) {

					System.out.println("checking block : " + (i + 1));
					BasicBlock	curBlock = blocks.get(i);
					List<InsInOut> curIns = curBlock.getLivenessList();
					oneTimeTraversal(curIns, isChanged);
					


					for(int idx_prev: curBlock.getPrev()) {

						System.out.println("checking the previous block : " + (idx_prev + 1) + "of  block " + (i + 1));
						BasicBlock prevBlock = blocks.get(idx_prev);
						List<InsInOut> prev = prevBlock.getLivenessList();
						InsInOut lastLine = prev.get(prev.size()-1);

						for(int idx_next: prevBlock.getNext()) {

							System.out.println("    adding: " + (idx_next +1) + " to " + (idx_prev+1) );
							//List<InsInOut> prev = prevBlock.getLivenessList();
							//InsInOut lastLine = prev.get(prev.size()-1);
							BasicBlock nbb = blocks.get(idx_next);
	
							Set<Variable> newOut = (unionTwoSets(lastLine.getOut(), (nbb.getLivenessList()).get(0).getIn(), isChanged));

							System.out.println("new Out");
							for( Variable v: newOut) {
								System.out.println(v.name().toString());
							}
							System.out.println("old Out");
							for( Variable t: lastLine.getOut()) {
								System.out.println(t.name().toString());
							}
		
							System.out.println("after replace");

							lastLine.replaceOut(newOut);

						
							oneTimeTraversal(prev, isChanged);
							//System.out.println("      " + lastLine.instruction().toString());
							//lastLine.printInOut();

						}

					//	oneTimeTraversal(prev, isChanged);
							System.out.println("      " + lastLine.instruction().toString());
							lastLine.printInOut();

					}

					
				}
			}

	}


/*

	public void allBlocksLiveness(List<BasicBlock> blocks) {
			boolean	isChanged = true;
			int counting = 0;
			while(counting < 10) {
				counting ++;
				recursivelyLiveAnalysis(blocks, blocks.get(0), isChanged);
			}

	}

	private Set<Variable> recursivelyLiveAnalysis(List<BasicBlock> blocks, BasicBlock block, boolean isChanged) {

		List<InsInOut> ins = block.getLivenessList();
		if(block.getNext() == null) { //this is the base case when we find the last block
			//ArrayList<InsInOut> ins = block.getLivenessList();	//get the InsInOut list
			isChanged = oneTimeTraversal(ins, isChanged);
			return ins.get(0).getIn(); // the in set of block is the in set of first instruction, and it is also the out set of previous block so return it.
		} else {
		 ins = block.getLivenessList();
		InsInOut lastIns = ins.get(ins.size()-1); //last instruction of the block
		Set<Variable> newSet = new HashSet<Variable>();
		for(int idx: block.getNext()) {
			//recursivelyLiveAnalysis(blocks, blocks.get(idx), isChanged);//just for test
	
			//newSet = unionTwoSets( newSet, recursivelyLiveAnalysis(blocks, blocks.get(idx), isChanged), isChanged );

		}

		isChanged = lastIns.replaceOut(newSet);
		oneTimeTraversal(ins, isChanged);

		return ins.get(0).getIn();
}
	}
*/
	private Set<Variable> unionTwoSets(Set<Variable> a, Set<Variable> b, boolean isChanged) {
		System.out.println("union---");
		for( Variable v: a) {
			System.out.println(v.name().toString());
							}
		System.out.println("and----");
		for( Variable v: b) {
								System.out.println(v.name().toString());
							}
		System.out.println("get----");
		Set<Variable> toReturn = new HashSet<Variable>();

        for(Variable v: a) {
            if(!b.contains(v)) {
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

		for( Variable v: toReturn) {
								System.out.println(v.name().toString());
							}
		System.out.println("ending union");
		return toReturn;
	}

}
