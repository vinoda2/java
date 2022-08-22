package com.xworkz.constructor;

public class ShopTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shops s = new Shops();
		System.out.println(s.name);
		s.shopOpenTime();
		
		Shops s1 = new Shops(200,50,150);
		System.out.println("no of employees:"+s1.noOfEmp);
		System.out.println("register number:"+s1.regNO);
		System.out.println("GST no:"+s1.gstNo);
		
	

	}

}
