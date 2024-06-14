package com.oops.polymorphismchild;

import com.oops.polymorphism.*;

public class Electronics extends Proudcts {

	private boolean battery;
	private boolean wireless;

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(boolean battery, boolean wireless) {
		super();
		this.battery = battery;
		this.wireless = wireless;
	}

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	public String getProduct1() {
		return "Brand:  " + getBrand() + " Price:  " + getPrice() + " Battery:  " + battery + " Wireless:  " + wireless;
		
	}
	
	@Override
	public String getProduct() {
		return "Brand:  " + getBrand() + " Price:  " + getPrice() + " Battery:  " + battery + " Wireless:  " + wireless;
		
	}
	

	@Override
	public String toString() {
		return "Electronics [battery=" + battery + ", wireless=" + wireless + "]";
	}

}
