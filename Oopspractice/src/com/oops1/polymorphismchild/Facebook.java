package com.oops1.polymorphismchild;
import com.oops1.polymorphism.*;

public class Facebook extends SocialMedia{
	private String userid;
	private long password;
	
	public Facebook() {}
	
	public Facebook(String userid, long password) {
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

	public long getPassword() {
		return password;
	}

	public void setPassword(long password) {
		this.password = password;
	}
	
	@Override
	public String getDisplay() {
		return "SocialMedia name: " + getName() + "SocialMedia Owner: " + getOwner() + "Userid: " + userid + "Password: " + password;
	}

	@Override
	public String toString() {
		return "Facebook [userid=" + userid + ", password=" + password + "]";
	}
	
	
	

}
