package com.xworkz.methodoverloading;

public class LaptopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop = new Laptop(1,"Dell","I5",50000);

		//method overloading
		laptop.getDetails();
		laptop.getDetails(3, "Lenova");
		laptop.getDetails("HP", 4);
		laptop.getDetails(5, "lenova","I3");
		laptop.getDetails(60000);
		
	}

}
