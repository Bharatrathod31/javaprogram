package com.oops.abastraction;

public class SavingAcc extends BankAcc{
	
	private static String intersetRate;
	private static String deposit;
	
	@Override
	public void printAccDetails() {
		System.out.println("BankName: " + getName() + " IdfcCode: " + getIfdcCode() + " IntersetRate: " + intersetRate + " Deposit: " + deposit);
		
	}

	public static String getIntersetRate() {
		return intersetRate;
	}

	public static void setIntersetRate(String intersetRate) {
		SavingAcc.intersetRate = intersetRate;
	}

	public static String getDeposit() {
		return deposit;
	}

	public static void setDeposit(String deposit) {
		SavingAcc.deposit = deposit;
	}
	
	

}
