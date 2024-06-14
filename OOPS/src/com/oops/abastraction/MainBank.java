package com.oops.abastraction;

public class MainBank {
	public static void main(String [] args) {
		
		SavingAcc.setIntersetRate("5%");
		SavingAcc.setDeposit("20000");
		
		CurrentAcc.setIntersetRate("10%");
		CurrentAcc.setDeposit("40000");
		
		BankAcc savingacc = new SavingAcc();
		BankAcc currentacc = new CurrentAcc();
		savingacc.setName("ABC");
		savingacc.setIfdcCode("123");
		
		currentacc.setName("HDFC bank");
		currentacc.setIfdcCode("454545");
		
		
		
		//savingacc.setName("HDFC Bank");
		//savingacc.equals("123123");
		savingacc.printAccDetails();
		
		currentacc.printAccDetails();
	}

}
