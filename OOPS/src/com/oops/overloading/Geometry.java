package com.oops.overloading;

public class Geometry {
	public void area(int height,int width) {
		System.out.println("Area of rect: " + (height * width));
		
	}
	public void area(int radius) {
		System.out.println("Area of circle: " + (3.14 *radius*radius));
		
	}
	
	public void area(float radius) {
		System.out.println("Area of Circle: " + (3.14 * radius * radius));
	}
	
	// Ambiguity
	public void area(float height,float width) {
		System.out.println("Area of rectangle: " + (height * width));
	}
	

}
