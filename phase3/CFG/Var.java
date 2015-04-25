import java.util.*;

/*
  this is the var unit with it color
*/

public class Var {

    private int color; //use different numbers to represent colors
    private String variable_name;

    public Var(String name) {
	this(name, -1); //-1 means not yet colored
    }

    public Var(String name, int color) {
	variable_name = name;
	this.color = color;
    }

    public String name() {
	return variable_name;
    }

    public int color() {
	return color;
    }

    public void setColor(int color) {
	this.color = color;
    }

    public boolean equals(Object other) {
	if (other == null)
	    return false;
	if(other == this)
	    return true;
	if(!(other instanceof Var))
	    return false;
	return ((Var)other).name().equals(this.name());
    }
}
