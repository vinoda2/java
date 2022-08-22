package com.xworkz.Inheritance;
//multilevel inheritance
public class SearchVersion2  extends SearchVersion1{
	
	public SearchVersion2(){
		super();
		System.out.println();
	}

	public SearchVersion2(String username,int contactNumber,String emailID,String password,String contentType) {
		this.username=username;
		this.contactNumber=contactNumber;
		this.emailID=emailID;
		this.password=password;
		this.contentType=contentType;
	}
	void updateNumber() {
		System.out.println("Number updated successfully");
	}

	void deleteNumber() {
		System.out.println("number deleted successfully");
	}
	
	void updateEmailID() {
		System.out.println("Email updated successfully");
	}
	void deleteEmailID() {
		System.out.println("Email deleted successfully");
	}
}
