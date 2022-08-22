package com.xworkz.String;

public class StringMethods {

	static String type="Mobile";
	String mobileName="Lenova";
	String mobileName1="Lenova";
	
	
	//== will check the address of the string not the content of the string
	void checkContent() {
		if(type==mobileName)
		{
			System.out.println("contents are eqaul");
		}else {
			System.out.println("not equal");
		}
	}
	
	//here it going to check content of the string
	void checkContent(String mobileName,String mobileName1) {
		if(mobileName.equals(mobileName1)) {
			System.out.println("contents are eqaul");
		}else {
			System.out.println("not equal");
		}
	
	}

	
}