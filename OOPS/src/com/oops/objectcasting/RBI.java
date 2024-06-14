package com.oops.objectcasting;

public class RBI extends Bank {
	private String printEquipments;
	
	public RBI() {}

	public RBI(String printEquipments,long accNo,String accType) {
		super(accNo,accType);
		this.printEquipments = printEquipments;
	}

	public String getPrintEquipments() {
		return printEquipments;
	}

	public void setPrintEquipments(String printEquipments) {
		this.printEquipments = printEquipments;
	}
	
	@Override
	public void printAccountDetais() {
		System.out.println("Acc NO: " + getAccNO() + " Account Type : " + getAccType());
		
	}
	
	

}
