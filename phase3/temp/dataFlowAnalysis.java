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

	// algorithms between block
	public void allBlocksLiveness(ArrayList<BasicBlock> blocks) {


	}

}