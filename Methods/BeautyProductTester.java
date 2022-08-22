package com.xworkz.Methods;

public class BeautyProductTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object
		
		//assigning values to the variables
		BeautyProduct product=new BeautyProduct();
		product.brand_name="Himalaya";
		product.id=1;
		product.product_name="Himalaya face cream";
		product.price=240.50f;
		
		//printing the values
		System.out.println("brand name:"+product.brand_name);
		System.out.println("brand name:"+product.id);
		System.out.println("brand name:"+product.product_name);
		System.out.println("brand name:"+product.price);
		
		//calling the methods
		product.information();
		String str=product.message();
		System.out.println(str);
		product.getId(2);
		product.getDetails(2, "Lipstick",200 ,"babylips");
		product.geteligible(400);
	}

}
