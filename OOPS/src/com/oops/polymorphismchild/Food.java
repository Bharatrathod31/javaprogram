package com.oops.polymorphismchild;
import com.oops.polymorphism.*;

public class Food extends Proudcts{
	private String expiryDate;
	private boolean Veg;

	public Food() {
		super();
	}

	public Food(String expiryDate, boolean veg) {
		super();
		this.expiryDate = expiryDate;
		Veg = veg;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean isVeg() {
		return Veg;
	}

	public void setVeg(boolean veg) {
		Veg = veg;
	}
	
	@Override
	public String getProduct() {
		return "Brand:  " + getBrand() + " Price: " + getPrice() + " ExpiryDate: " + expiryDate + " Veg: " + Veg ;
	}

	@Override
	public String toString() {
		return "Food [expiryDate=" + expiryDate + ", Veg=" + Veg + "]";
	}

}
