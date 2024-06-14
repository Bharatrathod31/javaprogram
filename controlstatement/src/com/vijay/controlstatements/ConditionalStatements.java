package com.vijay.controlstatements;

public class ConditionalStatements {
	private boolean expression;
	
	public ConditionalStatements() {
		
	}
	
	public ConditionalStatements(boolean expression) {
		this.expression = expression;
	}
	
	public void setExpression(boolean expression) {
		this.expression = expression;
	}
	
	public boolean getExpression() {
		return expression;
	}
	
	public void testIf() {
		if(expression) {
			System.out.println("if block!");
		}
	}
	
	public void testIfElse() {
		if(expression) {
			System.out.println("If block1");
		
		} else {
			System.out.println("else block!");
		}
	}
	
	public char testElseIfLadder(int marks) {
		if(marks>=90) {
			return 'A';
		}
		else if(marks>=80) {
			return 'B';
		}
		else if(marks>=70) {
			return 'C';
		}else if (marks>=60) {
			return 'D';
		}else if(marks>=50) {
			return 'E';
		}else {
			
			return 'F';
		}
	}
	
	public void testSwitch(char character) {
		switch(character) {
		case 'A':System.out.println("A grade Passed with maarkes above 90");
		break;
		case 'B':System.out.println("B grade passed with belove 90");
		break;
		case 'C':System.out.println("C grade passed with belove 80");
		break;
		case 'D':System.out.println("D grade with belov 70");
		break;
		case 'E':System.out.println("E grade wtih belov 60");
		break;
		case 'F':System.out.println("f grade failed");
		break;
		default:System.out.println("invalid input");
		}
		
	}

}
