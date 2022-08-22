package com.xworkz.constructor;

public class Battle {
	int id;
	String name;
	String brand_name;
	double price;
	
	//default constructor or user defined without parameter constructor
	Battle(){
		System.out.println("Default constructor");
	}
	
	//parameterized constructor
	//this keyword always points to the current object and also used to differentiate the instance variable and parameters 
	Battle(int id,String name,String brand_name,double price){
		this.id=id;
		this.name=name;
		this.brand_name=brand_name;
		this.price=price;
	}
	
	void getDetails() {
		System.out.println("All type of battles are available");
	}
}
