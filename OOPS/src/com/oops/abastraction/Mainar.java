package com.oops.abastraction;

public class Mainar {
	
	public static void main(String [] args) {
		
		// invoke constructor of abstract class ( anonymous class);
		ArithmeticOperation ar = new ArithmeticOperation () {
			@Override
			public int operation(int no1,int no2) {
				return no1 + no2;
			}
		};
		int result = ar.operation(10,20);
		System.out.println(result);
		
		ArithmeticOperation sub = new ArithmeticOperation() {
			@Override
			public int operation(int no1,int no2) {
				return no1 - no2;
			}
		};
		
		int result1=sub.operation(50,25);
		System.out.println(result1);
		
		ArithmeticOperation mul = new ArithmeticOperation () {
			@Override
			public int operation (int a , int b) {
				return a * b;
				
			}
		};
		int result2= mul.operation(10,5);
		System.out.println(result2);
		
		int result4= mul.operation(4,5);
		System.out.println(result4);
	}

}

/* anonymous class: it is only use for one time use.
 * 	 it reduce the no of lines of code & does not req to create no of class files.
 * disadvantage : you cannot use the object for multiple times.
*/