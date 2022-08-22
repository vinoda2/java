package com.xworkz.oops;

public class WhatsAppTester {

	public static void main(String[] args) {
		// creating object of WhatsApp
		
		WhatsApp user = new WhatsApp();
		//assigning values to the properties
		user.userID=1;
		user.userName="Mike";
		user.message="welcome";
		
		//displaying values
		System.out.println(user.userID);
		System.out.println(user.userName);
		System.out.println(user.message);
		
		//calling methods
		user.writeMessage();
		user.sendMessage();
		user.recieveMessage();
	}

}
