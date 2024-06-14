package com.oops.accesssmodifiere;

public class Child extends Parent{
	public void childShow() {
		Parent parent = new Parent();
		parent.number=10;
		parent.parentShow();
			
	}
	

}
