package com.xworkz.Methods;

public class BeautyProduct {

	int id;
	String product_name;
	float price;
	String brand_name;
	
	//method with single parameter
	void getId(int id) {
		System.out.println("product id is:"+id);
	}
	
	//method with more then one parameter
	void getDetails(int id,String product_name,float price,String brand) {
		System.out.println("product details:"+product_name);
		System.out.println("product details:"+price);
		System.out.println("product details:"+brand);
		
	}
	
	//method without parameter and return type
	void information() {
		System.out.println("beauty product got Five start in the market");
	}
	
	//method with parameter and return type
	float geteligible(float price) {
		if (price>=500.50) {
			System.out.println("your eligible for the offer");
		}else {
			System.out.println("GMO your not eligible for the offer buy extra");
		}
		return price;	
	}
	
	String  message() {
		String message="use good products";
		return message;
	}
}
