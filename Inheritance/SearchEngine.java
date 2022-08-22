package com.xworkz.Inheritance;

public class SearchEngine {

	String username;
	int contactNumber;
	String emailID;
	String password;
	String contentType;
	
	public SearchEngine() {
		System.out.println("Search Engine constructor");
	}
	
	public SearchEngine(String username,int contactNumber,String emailID,String password,String contentType) {
		this.username=username;
		this.contactNumber=contactNumber;
		this.emailID=emailID;
		this.password=password;
		this.contentType=contentType;
	}
	
	void createAccount(String username,String emailID,String password) {
		this.username=username;
		this.emailID=emailID;
		this.password=password;
	}
	
	void login(String username,String password) {
		this.username=username;
		this.password=password;
	}
	
	void logout() {
	System.out.println("logout successfully");
    }
}