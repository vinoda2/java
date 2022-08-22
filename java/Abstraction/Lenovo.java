package com.xworkz.Abstraction;

public class Lenovo  extends MiPhone{

	public static void main(String args[]) {
		Lenovo l = new Lenovo();
		l.getCompany();
		l.camera();
		String v=l.version();
		System.out.println(v);
		
		//Mobiles name = new Mobiles();
		
	}
}
