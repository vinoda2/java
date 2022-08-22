package com.xworkz.oops;

public class CosmeticsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Cosmetics cosmetics = new Cosmetics();
		 cosmetics.id=2;
		 cosmetics.product_name="face pack";
		 cosmetics.product_type="Beauty";
		 cosmetics.brand="XY";
		 cosmetics.price=340;
		 
		 System.out.println(cosmetics.id);
		 System.out.println(cosmetics.product_name);
		 System.out.println(cosmetics.product_type);
		 System.out.println(cosmetics.brand);
		 System.out.println(cosmetics.price);
		 
		 cosmetics.getAvailability();
		 cosmetics.getReview();
	}
}
