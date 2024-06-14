package com.oops.polymorphismmain;
import com.oops.polymorphism.*;
import com.oops.polymorphismchild.*;

public class Mainproducts {
	public static void main(String [] args) {
		Proudcts products = new Proudcts();
		Electronics charger = new Electronics();
		Food milk = new Food();
		
		charger.setBrand("1plus");
		charger.setPrice(1000.40f);
		charger.setBattery(false);
		charger.setWireless(false);
		
		milk.setBrand("Gokul");
		milk.setPrice(30.15f);
		milk.setExpiryDate("07-06-24");
		milk.setVeg(true);
		
		System.out.println(products.getProduct());
		
		// Polymorphism
		// Upcast : sub class to super class
		products =charger;
		
		System.out.println(products.getProduct());
		System.out.println(charger.getProduct1());
		
		products= milk;
		
		System.out.println(products.getProduct());
		
		
		
		
	}

}
