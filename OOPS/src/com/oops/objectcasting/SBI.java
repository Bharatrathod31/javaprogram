package com.oops.objectcasting;

public class SBI extends Bank{
	
	private long accNo;
	private String accType;
	
	public SBI() {}
	
	public SBI(long accNo, String accType) {
		super(accNo,accType);
		this.accNo = accNo;
		this.accType = accType;
	}
	
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public void printAccountDetais() {
		System.out.println("Acc NO: " + getAccNO() + " Account Type : " + getAccType());
		
	}
	


}
