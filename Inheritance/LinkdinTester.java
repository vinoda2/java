package com.xworkz.Inheritance;

public class LinkdinTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling all the properties and methods by using parent class object
		Linkdin linkdin = new Linkdin(12, "Stammer");
	
		System.out.println(linkdin.id);
		System.out.println(linkdin.username);
		
		linkdin.login();
		linkdin.getMessage();
		linkdin.logout();
		
		//calling all the properties and methods by using child class object
		LinkdinV1 linkdin1 = new LinkdinV1(25,"Lenova");
		System.out.println(linkdin1.id);
		System.out.println(linkdin1.username);
		
		linkdin1.login();
		linkdin1.getMessage();
		linkdin1.setProfile();
		linkdin1.updateContactNumber();
		linkdin1.logout();
		
		LinkdinV1 linkdin2 = new LinkdinV1();
		System.out.println(linkdin2.id);
		System.out.println(linkdin2.username);
		
		
	}

}
