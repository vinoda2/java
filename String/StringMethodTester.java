package com.xworkz.String;


public class StringMethodTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringMethods name = new StringMethods();
		StringMethods name1 = new StringMethods();
		
		name.checkContent();
		name.checkContent("Mobile", "Mobile");
		
		//it return the class of the object
		System.out.println(name.getClass());
		
		//it takes the object as a input and compare the two object whether object is same are not , return type is boolean
		System.out.println(name.equals(name1));
		
		//it displays the object class and address of on object return type is String
		System.out.println(name.toString());
		System.out.println(name);
		
		//in built method it available in all the classes
		System.out.println(name.hashCode());
	}

}
