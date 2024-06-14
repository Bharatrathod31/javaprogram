package com.oops.inheriatnce.dog;
import com.oops.inheritance.animal.*;

public class Dog extends Animal{
	
	private int legs;

	public Dog() {
		
		// TODO Auto-generated constructor stub
	}

	public Dog(int legs,int height,String color ,String species) {
		super(height,color, species);
		this.legs = legs;
	}
	
	public Dog(int legs) {
		this.legs=legs;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Dog [legs=" + legs + "Animal = " + super.toString() + "]";
	}
	
	
	
	
	
	

}
