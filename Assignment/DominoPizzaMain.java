package com.xworkz.Assignment;
//Assignment 1
public class DominoPizzaMain extends DominoPizza{
	
	public DominoPizzaMain() {
		super(5, 5000,"veg pizza");
	}
	
	//overriding the GST method 
	void calculateGST(int price) {
		int totalAmount=price;
		if(price<=500) {
			System.out.println("GST not applicable");
		}else if(price<=1000) {
			totalAmount+=(1000*0.05);
			System.out.println("GST is 5% and total amount is:"+totalAmount);
		}else {
			totalAmount+=(price*0.10);
			System.out.println("GST is 10% and total amount is:"+totalAmount);
		}
	}
	

}
