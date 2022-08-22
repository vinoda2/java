package com.xworkz.constructor;

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
		
		BeautyProduct product1 = new BeautyProduct(3);
		System.out.println("brand name:"+product1.id);
		
		BeautyProduct product2 = new BeautyProduct(500,"Face mask");
		System.out.println("brand name:"+product2.price);
		System.out.println("brand name:"+product2.product_name);
		
		
		
	}

}
