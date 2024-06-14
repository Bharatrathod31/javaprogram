package com.oops1.polymorphismmain;
import com.oops1.polymorphism.*;
import com.oops1.polymorphismchild.*;

public class Mainmethod {
	public static void main(String[] args) {
	
		SocialMedia socialmedia = new SocialMedia();
		Facebook fb = new Facebook();
		Instagram ig = new Instagram();
		
		fb.setName("Facebook");
		fb.setOwner("Mark Zukerberg");
		fb.setUserid("Vijay31");
		fb.setPassword(771594455);
		
		ig.setName("Instagram");
		ig.setOwner("Bill gates");
		ig.setUserid("Viju31");
		ig.setPassword("Vijay3101");
		
		System.out.println(socialmedia.getDisplay());
		
		//Upcasting
		socialmedia = fb;
		System.out.println(fb.getDisplay());
		
		socialmedia = ig;
		System.out.println(ig.getDisplay());
		
	
	}

}
