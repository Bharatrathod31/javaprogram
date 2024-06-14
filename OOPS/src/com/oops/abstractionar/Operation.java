package com.oops.abstractionar;

public abstract class Operation {
	private int no1;
	private int no2;
	public Operation(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}
	
	public Operation() {
		
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}
	
	
	//abstract method
	public abstract int operation(int no1,int no2);

	@Override
	public String toString() {
		return "Operation [no1=" + no1 + ", no2=" + no2 + "]";
	}
	
	

}
