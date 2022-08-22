package com.xworkz.constructor;

public class Cosmetics {
	int id;
	String product_name;
	String brand;
	String product_type;
	double price;
	
	public Cosmetics() {
		//achieving constructor chaining 
		//calling constructor inside the constructor
		this("Pinku");
		System.out.println("default constructor");
		
	}
	
	public Cosmetics(String brand) {
		this.brand=brand;
		System.out.println(brand);
	}
	public Cosmetics(int i, String string, String string2, String string3, double d) {
		//this keyword is always points to the current object
		this.id=i;
		this.product_name=string;
		this.brand=string2;
		this.product_type=string3;
		this.price=d;
		System.out.println("paramiterized constructor");
	}

	void getAvailability() {
		System.out.println("all types of products are available");
	}
	
	void getReview() {
		System.out.println("***** all products are good use");
	}
}
