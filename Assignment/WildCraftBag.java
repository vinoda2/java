package com.xworkz.Assignment;

public class WildCraftBag extends Bag{
	String companyName;
	int quality;
	
	public WildCraftBag() {
		super();
		System.out.println("Wildcraft constructor");
	}
	void getReview() {
		System.out.println("Ratings:* * * *");
	}
	void newOrder() {
		System.out.println("new order placed successfully");
	}
}
