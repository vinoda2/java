package com.xworkz.constructor;

public class Shops {
	int id;
	String name;
	String area;
	String ownerName;
	int noOfEmp;
	int regNO;
	int gstNo;
	String shopType;
	
	
	
	public Shops() {
		this("Laptop");
		System.out.println("Default construct");

	}
	
	 Shops(String name) {
		this.name=name;
	}
	 
	 Shops(String name,int id){
		 this.name=name;
		 this.id=id;
	 }
	 
	 Shops(int noOfEmp,int gstNo,int regNo){
		 this.noOfEmp=noOfEmp;
		 this.gstNo=gstNo;
		 this.regNO=regNo;
	 }
	 
	
	void shopOpenTime() {
		System.out.println("9AM");
	}
	void shopCloseTime() {
	System.out.println("10PM");
	}

}
