//package p3;

import java.util.*;

/*
  this class is the mininum unit(one instruction) with the in and out variable.

  Variable equals method has been overridden already with only comparing the variable name (register name)
*/

public class InsInOut {
	//private Instruction ins;
    private Instruction instruction;
    private Set<Temp> defTemp;
    private Set<Temp> useTemp;
    private Set<Variable> in; // var contains the temp and color
    private Set<Variable> out; // var contains the temp and color


    public InsInOut(Instruction ins) {
	this(ins, new HashSet<Variable>(), new HashSet<Variable>());
    }

    public InsInOut(Instruction ins, ArrayList<Variable> in, ArrayList<Variable> out) {
	instruction = ins;
    defTemp = new HashSet<Temp>();
    useTemp = new HashSet<Temp>();
    findUseDef();
	this.in = in;
	this.out = out;
    }

    private Set<Temp> findUseDef(Instruction ins) {
        if(ins instanceof Binary) {
           // useTemp.add((Binary)ins.operand1);
           // useTemp.add((Binary)ins.operand2);
           // defTemp.add((Binary)ins.operand3);

            addIfTemp(useTemp, (Binary)ins.operand1);
            addIfTemp(useTemp, (Binary)ins.operand2);
            addIfTemp(defTemp, (Binary)ins.operand3);

        } else if(ins instanceof Branch) {
            addIfTemp(useTemp, (Binary)ins.operand1);
            addIfTemp(useTemp, (Binary)ins.operand2);
        } else if (ins instanceof Assignment) {


        } else if (ins instanceof Return) {
            
        } else if (ins instanceof Call) {
            
        } else if (ins instanceof Callr) {
            
        } else if (ins instanceof ArrayStore) {
            
        } else if (ins instanceof ArrayLoad) {
            
        }

    }

    private void addIfTemp(Set<Temp> set, Object o) {
        if(o instanceof Temp) {
            set.add((Temp)o);
        }

    }

    public Set<Temp> getDef() {
        return defTemp;

    }

    public Set<Temp> getUse() {
        return useTemp;

    }


    public Instruction instruction() {
	return instruction;
    }

    public Set<Variable> getIn() {
	return in;
    }

    public Set<Variable> getOut() {
	return out;
    }
/*
    public void addToIn(Variable v) {
	if(!in.contains(v))
	    in.add(v);
    }

    public void addToOut(Variable v) {
	if(!out.contains(v))
	    out.add(v);
    }

    public void remFromIn(Variable v) {
	if(in.contains(v)) {
	    in.remove(v);
	}
    }

    public void remFromOut(Variable v) {
	if(out.contains(v)) {
	    out.remove(v);
	}
    }
*/
    public boolean replaceIn(Set<Variable> in) {
        boolean isChanged = false;
        for(Variable v: in) {
            if(!this.in.contains(v)) {
                isChanged = true;
            }
        }
        for(Variable v: this.in) {
            if(!in.contains(v)) {
                isChanged = true;
            }
        }
	   this.in = in;
       return isChanged;
    }

    public boolean replaceOut(Set<Variable> out) {
        boolean isChanged = false;
        for(Variable v: out) {
            if(!this.out.contains(v)) {
                isChanged = true;
            }
        }
        for(Variable v: this.out) {
            if(!out.contains(v)) {
                isChanged = true;
            }
        }
	   this.out = out;
       return out;
    }

}
