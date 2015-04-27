package p3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public InsInOut(Instruction ins, HashSet<Variable> in, HashSet<Variable> out) {
	instruction = ins;
    defTemp = new HashSet<Temp>();
    useTemp = new HashSet<Temp>();
    findUseDef(ins);
	//printUseDef();
	this.in = in;
	this.out = out;
    }

	public void printUseDef() {
		System.out.println();
		System.out.println(instruction);
		Set<Temp> def = getDef();
		Set<Temp> use = getUse();
		System.out.print("Def: ");
		for(Temp t: def) {
			System.out.print(" " + t);
		}
		System.out.println();
		System.out.print("Use: ");
		for(Temp t: use) {
			System.out.print(" " + t);
		}
		System.out.println();
	}

	public void printInOut() {
	System.out.print("in set: ");
	for(Variable v: in) {
		System.out.print("  " + v.toString());
	}
	System.out.println();

	System.out.print("out set: ");
	for(Variable v: out) {
		System.out.print("  " + v.toString());
	}
	System.out.println();

	}



    private void findUseDef(Instruction ins) {
        if(ins instanceof Binary) {
            addIfTemp(useTemp, ((Binary)ins).operand1);
            addIfTemp(useTemp, ((Binary)ins).operand2);
            addIfTemp(defTemp, ((Binary)ins).operand3);
        } else if(ins instanceof BinaryImm) {
            addIfTemp(useTemp, ((BinaryImm)ins).operand1);
            addIfTemp(defTemp, ((BinaryImm)ins).operand3);
        }else if(ins instanceof BinaryTwoImm) {
            addIfTemp(defTemp, ((BinaryTwoImm)ins).operand3);
        }else if(ins instanceof Branch) {
            addIfTemp(useTemp, ((Branch)ins).operand1);
            addIfTemp(useTemp, ((Branch)ins).operand2);
        } else if (ins instanceof Assignment) {
			addIfTemp(defTemp, ((Assignment)ins).operand1);
			addIfTemp(useTemp, ((Assignment)ins).operand2);
        } else if (ins instanceof Return) {
            addIfTemp(defTemp, ((Return)ins).operand);
        } else if (ins instanceof Return) {
            addIfTemp(defTemp, ((Return)ins).operand);
        } else if (ins instanceof Call) {
            
        } else if (ins instanceof Callr) {
            
        } else if (ins instanceof ArrayStore) {
            
        } else if (ins instanceof ArrayLoad) {
            
        }
    }

    private void addIfTemp(Set<Temp> set, Object o) {
        if(o instanceof Temp) {
			if(!Pattern.matches("^(\\d*(\\.)?\\d*)$", o.toString()) )
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
       return isChanged;
    }

}
