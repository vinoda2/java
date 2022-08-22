package com.xworkz.methodoverloading;

public class Laptop {

	int id;
	String laptopName;
	String laptopVersion;
	double price;
	
	//constructor
	public Laptop(int id,String laptopName,String laptopVersion, double price){
		this.id=id;
		this.laptopName=laptopName;
		this.laptopVersion=laptopVersion;
		this.price=price;
	}
	
	void getDetails() {
		System.out.println("method without arguments");
	}
	
	//argument list is changed but method name is same
	void getDetails(int id, String laptopName) {
		System.out.println("laptop id is:"+id+" "+" laptop Name: "+laptopName);
	}
	
	void getDetails(int id,String laptopName,String version) {
		System.out.println("laptop id is:"+id+" "+" laptop Name: "+laptopName+" "+"laptop version:"+version);
	}
	
	void getDetails(String laptopName,int id) {
		System.out.println("laptop id is:"+id+" "+" laptop Name: "+laptopName);
	}
	
	void getDetails(double price) {
		System.out.println("laptop price :"+price+"$");
	}
	
	
	
}
