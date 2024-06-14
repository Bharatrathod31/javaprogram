package com.oops.abstractionar;

public class MainOperation {
	
	public static void main(String [] args) {
		Operation add = new Addition();
		Operation sub = new Subtraction();
		Operation mul = new Multiplication ();
		Operation div = new Division();
		Operation mod = new Modulus();
		
		System.out.println(add.operation(10,20));
		System.out.println(sub.operation(30,20));
		System.out.println(mul.operation(40,20));
		System.out.println(div.operation(100,20));
		System.out.println(mod.operation(10000,20));
		
		
	}

}
