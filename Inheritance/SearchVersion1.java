package com.xworkz.Inheritance;

public class SearchVersion1 extends SearchEngine {

	String version;
	public SearchVersion1() {
		System.out.println("default contructor in version1");
	}
	
	public SearchVersion1(String version){
		super("admin",9987,"admin@gmail.com","admin@1","meaning of god");
		this.version=version;
	}
	
	void setProfile() {
		System.out.println("profile updated successfully");
	}
	
	void login(String username,int contactNumber,String emailID,String password)
	{
		this.username=username;
		this.contactNumber=contactNumber;
		this.emailID=emailID;
		this.password=password;
		System.out.println("login successfully");
	}
}
