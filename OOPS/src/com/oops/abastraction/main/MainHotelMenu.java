package com.oops.abastraction.main;
import com.oops.abastraction.*;

public class MainHotelMenu {
	
	public static void menu(String [] args) {
		 HotelMenu menu = new VegMenu();
		 
		 // Accessing super class method
		 menu.setSrNo(1);
		 menu.displayMenu();
		 
		 HotelMenu nonvegmenu = new NonVegMenu();
		 nonvegmenu.setSrNo(2);
		 nonvegmenu.displayMenu();
	}

}
