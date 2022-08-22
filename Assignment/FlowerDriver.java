package com.xworkz.Assignment;

public class FlowerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower = new Flower("Rose","All time","kashmir");
		flower.getavailability();
		
		System.out.println(flower.toString());
		
		Flower flower1 = new Flower("Rose","All time","kashmir");
		System.out.println(flower.equals(flower1));
		
		
		
	}

}
