package com.oops.polymorphism;

public class Proudcts {

	private float price;
	private String brand;

	public Proudcts() {
	}

	public Proudcts(float price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getProduct() {
		return "Price: " +  price + "  Brand:  " + brand;
	}

	@Override
	public String toString() {
		return "Proudcts [price=" + price + ", brand=" + brand + "]";
	}

}
