import java.util.*;

public class dataFlowAnalysis {
	

	// algorithms between instruction

	/*    in[I] = (out[I] - def[I]) U use[I]      */
	public Set<Variable> insInFromOut(InsInOut ins) {
		Set<Variable> in = addToSet(removeFromSet(ins.getOut(), ins.getDef()) , ins.getUse());
		ins.replaceIn(in);
		return in;
	}

	private Set<Variable> addToSet(Set<Variable> set, Set<Temp> toAdd) {
		for(Temp t: toAdd) {
			set.add(new Variable(t));
		}
		return set;
	}

	private Set<Variable> removeFromSet(Set<Variable> set, Set<Temp> toRemove) {
		if(set != null) {
			for(Temp t: toRemove) {
				Variable v = new Variable(t);
				if(set.contains(v)) {
					set.remove(t);
				}
			}
		}
		return set;
	}

	//algorithms within block
	public void blockLiveness(ArrayList<InsInOut> instruction) {
		int n = instruction.size();
		Set<Variable> prevIn = new Set<Variable>();
		for(int i = n - 1; i >=0; i--) {
			InsInOut cur = instruction.get(i);
			if (i < n - 1) {
				cur.replaceOut(prevIn);
			}
			prevIn = insInFromOut(cur);
		}
	}

	// algorithms between block
	public void allBlocksLiveness() {

	}

}