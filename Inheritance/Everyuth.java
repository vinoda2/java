package com.xworkz.Inheritance;

public class Everyuth {
	int id;
    String productname;
	String productType;
	String qrcode;
	double price;
	
	Everyuth(){
		System.out.println("default constructor");
	}
	Everyuth(int id, String productname,String productType,String qrcode, double price){
		this.id=id;
		this.productname=productname;
		this.productType=productType;
		this.qrcode=qrcode;
		this.price=price;
	}
	
	void productType()
	{
		System.out.println("natural everyuth");
		
	}
}
