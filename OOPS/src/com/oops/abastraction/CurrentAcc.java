package com.oops.abastraction;

public class CurrentAcc extends BankAcc{
	
	private static String intersetRate;
	private static String deposit;
	
	public void printAccDetails() {
		System.out.println("BankName: " + getName() + " IdfcCodoe: " + getIfdcCode()  + " IntersetRate: " + intersetRate + " Deposit" + deposit);
	}

	public static String getIntersetRate() {
		return intersetRate;
	}

	public static void setIntersetRate(String intersetRate) {
		CurrentAcc.intersetRate = intersetRate;
	}

	public static String getDeposit() {
		return deposit;
	}

	public static void setDeposit(String deposit) {
		CurrentAcc.deposit = deposit;
	}
	
	

}
