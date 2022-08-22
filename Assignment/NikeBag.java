package com.xworkz.Assignment;

public class NikeBag extends Bag{
	String companyName;
	int quality;
	
	public NikeBag() {
		super();
		System.out.println("Nike constructor");
	}
	
	void getReview() {
		System.out.println("Ratings:* * * * *");
	}
	
}
