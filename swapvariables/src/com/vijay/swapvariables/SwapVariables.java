package com.vijay.swapvariables;

public class SwapVariables {
	public int num1;
	public int num2;
	
	public SwapVariables() {
		
	}
	
	public SwapVariables(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void SwapvariablesUsingTemp() {
		System.out.println("Before swapping: ");
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swapping: ");
		System.out.println("Num1: "+ num1);
		System.out.println("Num2: "+ num2);
		
		
		
		
	}
	
	public void SwapvariablesWithoutUsingTemp() {
		System.out.println("Before swapping: ");
		System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("After swapping: ");
		System.out.println("Num1: "+ num1);
		System.out.println("Num2: "+ num2);
		
		
	}

}
