package com.oops.mainoverloading;
import com.oops.overloading.*;

public class Maingeometry {
	public static void main(String[] args) {
		Geometry rectangle = new Geometry();
		rectangle.area(10,20);
		
		Geometry circle = new Geometry();
		circle.area(4);
		
		Geometry circlec = new Geometry();
		circlec.area(4.13f);
		
		Geometry areaa= new Geometry();
		areaa.area(2.4f,2.4f);
	}

}
