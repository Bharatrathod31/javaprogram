package com.oops.abstraction;

public class SavingAcc extends BankApp{
	private static int intersetRate;
	private static long deposit;
	public SavingAcc() {
		super();
	}
	public static int getIntersetRate() {
		return intersetRate;
	}
	public static void setIntersetRate(int intersetRate) {
		SavingAcc.intersetRate = intersetRate;
	}
	public static long getDeposit() {
		return deposit;
	}
	public static void setDeposit(long deposit) {
		SavingAcc.deposit = deposit;
	}
	
	@Override
	public void printDetails() {
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("MobNO: " + getMobNo());
		System.out.println("intersetRate: " + intersetRate);
		System.out.println("Deposit: " + deposit);
	}
	@Override
	public String toString() {
		return "SavingAcc [getName()=" + getName() + ", getAge()=" + getAge() + ", getMobNo()=" + getMobNo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	

}
