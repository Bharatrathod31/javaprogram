package com.oops.enumration.menuprint;

import java.util.Scanner;

public class Menu {
	
	public int printMenu() {
		Scanner scanner = new Scanner(System.in);
		for(Menuoption Menuoption:Menuoption.values()) {
			System.out.println(Menuoption.getSerialNum()
					+"." + Menuoption.name()
					+ "." + Menuoption.getMenuDescription());
		}
		//int choice = scanner.nextInt();
		
		return scanner.nextInt();
		
	}

}
