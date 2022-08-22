package com.xworkz.Inheritance;

public class EveryuthTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Everyuth every = new Everyuth();
		EveryuthProduct product = new EveryuthProduct();
		Everyuth yuth = new EveryuthProduct();
		
		every.productType();//parent
		product.productType();//child
		yuth.productType();//child
	}
}
