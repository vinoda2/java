package com.xworkz.constructor;

public class Instagram {
	int id;
	String username;
	String password;
	
	public Instagram(){
		this(4,"vinoda","v@1");
		System.out.println("User defined");
		
	}
	
	public Instagram(int id, String username, String password) {
		// TODO Auto-generated constructor stub
		//this();
		this.id=id;
		this.username=username;
		this.password=password;
		
	}
	
	void login() {
		System.out.println("Login successful");
	}

	void logout() {
		System.out.println("Logout successful");
	}
}
