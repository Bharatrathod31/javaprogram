package com.oops.overriding;

public class Child extends Parent{
	
	@Override
	public void printProfession() {
		System.out.println("Profession of Child: "+ getProfession());
	}
	
	@Override
	public Child getObject() {
		return new Child();
	}
	

}
