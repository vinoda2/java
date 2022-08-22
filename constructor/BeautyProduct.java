package com.xworkz.constructor;

public class BeautyProduct {

	int id;
	String product_name;
	float price;
	String brand_name;
	
	BeautyProduct(){
		System.out.println("Constructor without parameter");
	}
	
	BeautyProduct(int id){
		this.id=id;
		System.out.println("Single parameter constructor");
	}
	
	BeautyProduct(float price, String product_name){
		System.out.println("constructor with two parameter");
		this.product_name=product_name;
		this.price=price;
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
