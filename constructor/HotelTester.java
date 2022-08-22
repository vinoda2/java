package com.xworkz.constructor;

public class HotelTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel(12,"VIBHA");
		System.out.println(hotel.hotelID);
		System.out.println(Hotel.hotelName);
		
		Hotel hotel1=new Hotel(34);
		System.out.println("order id is:"+hotel1.orderID);
		
		Hotel hotel2=new Hotel(245);
		System.out.println("order price is:"+hotel2.price);
		
		Hotel hotel3=Hotel.getInstance();
		System.out.println(hotel3);
	}

}
