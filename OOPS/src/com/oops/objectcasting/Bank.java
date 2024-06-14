package com.oops.objectcasting;

public class Bank {
	private long accNO;
	private String accType;
	
	
	public Bank() {}
	
	public Bank(long accNO, String accType) {
		
		this.accNO = accNO;
		this.accType = accType;
	}
	public long getAccNO() {
		return accNO;
	}
	public void setAccNO(long accNO) {
		this.accNO = accNO;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}

	
	
	public void printAccountDetais() {
		System.out.println("Acount no: " + getAccNO() + "Account Type: " + getAccType());
	}
	
	@Override
	public String toString() {
		return "Bank [accNO=" + getAccNO() + ", accType=" + getAccType() + "]";
	}
	

}
// plane old java object : pojoa/Beans
// Beans : 