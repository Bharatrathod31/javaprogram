package com.oops.abastraction;

public abstract class HotelMenu {
	private int srNo;
	
	public HotelMenu() {
		
	}

	public HotelMenu(int srNo) {
		super();
		this.srNo = srNo;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	
	public abstract void displayMenu();

	@Override
	public String toString() {
		return "HotelMenu [srNo=" + srNo + "]";
	}
	
	/* abstraction: hiding your implementation and showing only neccssary req
	 * ex. if you go to hotel and order the food you will only know the food but not the procees of making the food how the food is going cook . so you only get the food which you order 
	 * abstract method: there is no implementation only definition . you cannot write this method on the normal class you can written in the only in abstract class
	 * implementaion of the abstract method only done in the child class of the abstract class by using the override method in the child class.
	 * Mainmethod : you cannot create the object of the abstract class .
	 *              you can create the object of the concrent class which is not contain any abstract method
	 *              here you use upcasting 
	 *              ex parent obj = new childclass;
	 *              
	 */
	

}
