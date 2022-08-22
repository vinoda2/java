package com.xworkz.constructor;

public class Hotel {
	int hotelID;
	static String hotelName;
	int itemNumbers;
	int orderID;
	double price;
	
	//final double price=230;
	
	/*we can't have static constructor because static is class level but constructor used to assign or initialize the 
	 * instance variables so that static constructor is not possible in java
	 * compile time error
	 * 
	 * public static Hotel()
	{
		System.out.println("user defined constructor");
	}*/
	public Hotel(int hotelID,String hotelName){
		this.hotelID=hotelID;
		Hotel.hotelName=hotelName;
	}
	
	/* compile time error
	 * because when we define variable as a final we can't modify or assign the values to it
	 * it acts like a constant
	Hotel(double price){
		this.price=price;
	}
	*/
	protected Hotel(int orderID) {
		this.orderID=orderID;
	}
	
	/*directly we can't access but we can access by using getter and setter methods when variables are private
	private Hotel(double price) {
		this.price=price;
	}
	*/
	private Hotel() {
		System.out.println("I'm a private constructor");
	}
	
	//we can have class name as a return type  and it return object address or object
	public static Hotel getInstance() {
		Hotel object=new Hotel();
		return object;
	}
	
	/*
	//we can only return the object if return type is Class 
	public Hotel getID() {
		return hotelName;
	}*/
	
}
