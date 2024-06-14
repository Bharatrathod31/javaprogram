package com.oops1.polymorphism;

public class SocialMedia {
	private String name;
	private String owner;
	
	public SocialMedia() {}
	
	public SocialMedia(String name, String owner) {
		super();
		this.name = name;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getDisplay() {
		return "SocialMedia Name: " + name + " Owner: " + owner;
	}

	@Override
	public String toString() {
		return "SocialMedia [name=" + name + ", owner=" + owner + "]";
	}
	
	
	
	

}
