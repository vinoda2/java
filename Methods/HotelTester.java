package com.xworkz.Methods;

public class HotelTester {

	public static void main(String[] args) {
		Hotel name = new Hotel();
		name.hotelDetails();
		name.hotelDetails("Google");
		name.hotelDetails("InTglow", 8);
		name.hotelDetails("Sagar", 5, "metro station", 50);
	}

}

