package com.oops.abastraction;

public abstract class BankAcc {
	private String name;
	//private String ifdcCode;
	private int age;
	private long mobNo;
	
	
	
	public BankAcc(String name, String ifdcCode) {
		super();
		this.name = name;
		this.name = ifdcCode;
	}
	
	public BankAcc() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIfdcCode() {
		return name;
	}

	public void setIfdcCode(String ifdcCode) {
		this.name = ifdcCode;
	}
	
	public abstract void  printAccDetails();

	@Override
	public String toString() {
		return "BankAcc [name=" + name + ", ifdcCode=" + name + "]";
	}

	
		
	

}
