package com.oops.mainoverriding;
import com.oops.overriding.*;
public class Mainparent {
	public static void main(String[] args) {
		
		Parent chotu = new Parent();
		chotu.setProfession("Clerk");
		
		Child raju = new Child();
		raju.setProfession("Vasuli");
		
		chotu.printProfession();
		raju.printProfession();
	}

}
