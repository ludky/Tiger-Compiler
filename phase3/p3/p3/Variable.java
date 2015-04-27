package p3;

import java.util.*;

public class Variable {

    private int color; //use different numbers to represent colors
    private Temp variable_name; // change to temp
	private String name;



    public Variable(Temp name) {
	this(name, -1); //-1 means not yet colored
    }

    public Variable(Temp name, int color) {
	variable_name = name;
	this.name = name.getName();
	this.color = color;
    }

    public Temp name() {
	return variable_name;
    }

    public int color() {
	return color;
    }

    public void setColor(int color) {
	this.color = color;
    }

	@Override
	public int hashCode(){
		//String s = variable_name.getName();

		return (name.hashCode() * name.hashCode());
	}


	@Override
    public boolean equals(Object other) {
	if (other == null)
	    return false;
	if(other == this)
	    return true;
	if(!(other instanceof Variable))
	    return false;
	return ((((Variable)other).name())).equals((this.name()));
    }

	public String toString() {
		return variable_name.toString();
	}
}
