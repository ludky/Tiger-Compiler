//package p3;

import java.util.*;

/*
  this class is the mininum unit(one instruction) with the in and out variable.

  Variable equals method has been overridden already with only comparing the variable name (register name)
*/

public class StreamInOut {
	//private Instruction ins;
    private Instruction instruction;
    private List<Variable> in; // var contains the temp and color
    private List<Variable> out; // var contains the temp and color


    public StreamInOut(Instruction ins) {
	this(ins, new ArrayList<Variable>(), new ArrayList<Variable>());
    }

    public StreamInOut(Instruction ins, ArrayList<Variable> in, ArrayList<Variable> out) {
	instruction = ins;

	this.in = in;
	this.out = out;
    }

    public Instruction instruction() {
	return instruction;
    }

    public List<Variable> getIn() {
	return in;
    }

    public List<Variable> getOut() {
	return out;
    }

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

    public void replaceIn(List<Variable> in) {
	this.in = in;
    }

    public void replaceOut(List<Variable> out) {
	this.out = out;
    }

}
