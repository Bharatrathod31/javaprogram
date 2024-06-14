package com.oops.abstraction;

public abstract class BankApp {
	private String name;
	private int age;
	private long mobNo;
	
	public BankApp() {
		
	}
	public BankApp(String name, int age, long mobNo) {
		super();
		this.name = name;
		this.age = age;
		this.mobNo = mobNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	public abstract void printDetails();
	@Override
	public String toString() {
		return "BankApp [name=" + name + ", age=" + age + ", mobNo=" + mobNo + "]";
	}
	
	
	

}
