import java.util.*;

/*
  this class is the mininum unit(one instruction) with the in and out variable.

  Var equals method has been overridden already with only comparing the variable name (register name)
*/

public class streamInOut {
    private String instruction;
    private List<Var> in;
    private List<Var> out;


    public streamInOut(String ins) {
	this.(ins, new ArrayList<Var>, new ArrayList<Var>);
    }

    public streamInOut(String ins, ArrayList<Var> in, ArrayList<Var> out) {
	instruction = ins;

	this.in = in;
	this.out = out;
    }

    public String instruction() {
	return instruction;
    }

    public List<Var> getIn() {
	return in;
    }

    public List<Var> getOut() {
	return out;
    }

    public void addToIn(Var v) {
	if(!in.contains(v))
	    in.add(v);
    }

    public void addToOut(Var v) {
	if(!out.contains(v))
	    out.add(v);
    }

    public Var remFromIn(Var v) {
	if(in.contains(v)) {
	    return in.remove(v);
	} else
	    return null;
    }

    public Var remFromOut(Var v) {
	if(out.contains(v)) {
	    return out.remove(v);
	} else
	    return null;
    }

    public void replaceIn(List<Var> in) {
	this.in = in;
    }

    public void replaceOut(List<Var> out) {
	this.out = out;
    }

}
