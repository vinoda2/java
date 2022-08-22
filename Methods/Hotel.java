package com.xworkz.Methods;

public class Hotel {
	String name;
	int hotelID;
	String location;
	int staff;
	
	//method overloading
	void hotelDetails(String name) {
		System.out.println("Hotel name:"+name);
	}
	
	void hotelDetails() {
		System.out.println("without arguments");
	}
	
	void hotelDetails(String name,int hotelID) {
		System.out.println("name of the hotel:"+name+" :and hotel ID:"+hotelID);
	}
	
	void hotelDetails(String name, int hotelID, String location,int staff) {
		System.out.println(name+" "+" "+hotelID+" "+location+" "+" "+staff);
	}
	
}
