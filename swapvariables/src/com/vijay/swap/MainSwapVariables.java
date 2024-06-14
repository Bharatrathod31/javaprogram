package com.vijay.swap;

import com.vijay.swapvariables.SwapVariables;

public class MainSwapVariables {
	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		int num3=40;
		int num4=50;
		
		SwapVariables swapvariables = new SwapVariables(num1,num2);
		SwapVariables swapvariables1 = new SwapVariables();
		swapvariables1.setNum1(num3);
		swapvariables1.setNum2(num4);
		
	
		//swapvariables.SwapvariablesUsingTemp();
		//swapvariables1.SwapvariablesWithoutUsingTemp();
		swapvariables.getNum1();
	}

}
