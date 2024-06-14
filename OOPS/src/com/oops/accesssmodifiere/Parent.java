package com.oops.accesssmodifiere;

class Parent {
	
	public int number;
	public Parent() {
		
	}
	
	public void parentShow() {
		System.out.println("parent show:");
	}
	
	private void parentShowTest() {
		parentShow();
		number = 10;
	}

}
