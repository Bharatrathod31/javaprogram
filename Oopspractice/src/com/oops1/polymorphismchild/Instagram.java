package com.oops1.polymorphismchild;
import com.oops1.polymorphism.*;

public class Instagram extends SocialMedia{
	private String userid;
	private String password;
	
	public Instagram() {
		
	}
	public Instagram(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override 
	public String getDisplay() {
		return "SocialMeida Name: " + getName() + " SocialMedia Owner: " + getOwner() + " Userid: " + userid + " Password: " + password;
	}
	@Override
	public String toString() {
		return "Instagram [userid=" + userid + ", password=" + password + "]";
	}
	
	

}
