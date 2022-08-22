package com.xworkz.Inheritance;

public class Linkdin {
	int id;
	String username;
	
	Linkdin(){
		System.out.println("parent class constructor");
	}
	
	Linkdin(int id,String username){
		this.id=id;
		this.username=username;
	}
	
	void getMessage() {
		System.out.println("Welcome to Linkdin page");
	}
	
	void login() {
		System.out.println("login successful");
	}
	
	void logout() {
		System.out.println("you Logged out from your profile");
	}
}
