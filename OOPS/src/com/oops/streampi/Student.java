package com.oops.streampi;

public class Student {
	private int rolllNo;
	private String name;
	private int age;
	
	public Student() {
		
	}
	public Student(int rolllNo, String name, int age) {
		super();
		this.rolllNo = rolllNo;
		this.name = name;
		this.age = age;
	}
	public int getRolllNo() {
		return rolllNo;
	}
	public void setRolllNo(int rolllNo) {
		this.rolllNo = rolllNo;
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
	
	
	@Override
	public String toString() {
		return "Student [rolllNo=" + rolllNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
