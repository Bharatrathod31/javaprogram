package com.oops.enumration.menuprint;

public class Mainmenu {
	public static void main(String[] args ) {
		Menu menu = new Menu();
		
		switch (menu.printMenu()) {
		case 1-> System.out.println("add");		
		case 2-> System.out.println("Update");		
		case 3-> System.out.println("Select");	
		case 4-> System.out.println("Select all");	
		case 5-> System.out.println("Delete");	
		case 6-> System.out.println("Sort");	
		case 0-> System.out.println("Exit");	
		case default-> System.out.println("Invalid Input");	
		}
		
		switch (menu.printMenu()) {
		for(Menuoption menu():Menuoption.values()) {
			
		}
		}
	}

}
