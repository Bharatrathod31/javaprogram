package com.oops.inheritance.german;
import com.oops.inheriatnce.dog.*;
public class GermanShephard  extends Dog{
	private String name;
	
	public GermanShephard() {}

	public GermanShephard(String name,int legs,int height,String color,String species) {
		super(legs,height,color,species);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GermanShephard [name=" + name + " " + super.toString() + "]";
	}
	
	

}
