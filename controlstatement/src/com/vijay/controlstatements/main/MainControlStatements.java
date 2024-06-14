package com.vijay.controlstatements.main;

import com.vijay.controlstatements.ConditionalStatements;

public class MainControlStatements {
	public static void main(String[] args) {
		int variable1=10;
		int variable2=10;
		//int variable3=20;
		ConditionalStatements conditionalStatements = new ConditionalStatements(variable1==variable2);
		//ConditionalStatements conditionalStatements1 = new ConditionalStatements();
		//conditionalStatements1.setExpression
		//((variable1 < variable2) && (variable1<variable3));
		
		
		conditionalStatements.testIf();
		//conditionalStatements1.testIf();
		
		//if (variable1<variable2) {
			
		//}
		//conditionalStatements.testIfElse();
		//conditionalStatements1.testIfElse();

		//char result=conditionalStatements.testElseIfLadder(77);
		//System.out.println("Result: "+ result);
		
		//conditionalStatements.testSwitch(result);
		
	}

}
