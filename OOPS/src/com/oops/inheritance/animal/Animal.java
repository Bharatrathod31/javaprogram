package com.oops.inheritance.animal;

public class Animal {
	
	private int height;
	private String color;
	private String species;
	public Animal(int height, String color, String species) {
		
		this.height = height;
		this.color = color;
		this.species = species;
	}
	
	public Animal() {}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
	public String toString() {
		return "Animal [height=" + height + ", color=" + color + ", species=" + species + "]";
	}
	
	
	
	

}
