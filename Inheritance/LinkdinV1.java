package com.xworkz.Inheritance;

//extending the Linkdin class it is single inheritance
public class LinkdinV1 extends Linkdin {
	
	LinkdinV1(){
		System.out.println("child class constructor");
	}
	
	LinkdinV1(int id, String username) {
		super(id, username);
		// TODO Auto-generated constructor stub
	}

	void setProfile() {
		System.out.println("profile created");
	}
	
	void updateContactNumber() {
		System.out.println("contact number updated succussfully");
	}
}
