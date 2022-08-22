package com.xworkz.Assignment;

//Assignment 2
public class Bag {
	String bagQRcode="hhatsuyt34";
	short width;
	short hight;
	String brand="Wildcraft";
	String color;
	String bagType;
	int price;
	
	public Bag() {
		System.out.println("bag default constructor");
	}
	public Bag(String color,int hight) {
		this();
		this.color=color;
		this.hight=(short) hight;
		
	}
	
	void getOrder() {
		System.out.println("get a new order");
	}
	
	void getStock() {
		System.out.println("stock available");
	}
	
	public String toString() {
		return (bagQRcode+" "+color+" "+brand);
	}
}
