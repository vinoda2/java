package com.xworkz.constructor;

public class CosmeticsDriver {

	public static void main(String[] args) {
		
		//default constructor
		Cosmetics name = new Cosmetics();
		System.out.println(name);
		//calling parameterized constructor
		Cosmetics cos = new Cosmetics(12,"himayala facewash","Himayala","facewash",250.50);
		System.out.println(cos.id);
		System.out.println(cos.product_name);
		System.out.println(cos.brand);
		System.out.println(cos.product_type);
		System.out.println(cos.price);
		
		cos.getAvailability();
	}

}
