package com.oops.abstraction;

public class MainBank {
	public static void main() {
		BankApp savingacc = new SavingAcc();
		savingacc.setName("Vijay");
		savingacc.setAge(23);
		savingacc.setMobNo(771594455);
		SavingAcc.setIntersetRate(10);
		SavingAcc.setDeposit(60000);
		
		savingacc.printDetails();
	}

}
