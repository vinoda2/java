package com.xworkz.singletonDesign;

public class SingletonDesign {
	//create object of type class
	private static SingletonDesign pattern = new SingletonDesign();
	
	//defining  constructor
	private SingletonDesign() {
		System.out.println(" private constructor");
	}
	
	//creating method type of class and its returning object 
	public static SingletonDesign getSingletonDesign() {
		System.out.println("singleton design pattern");
		return pattern;
		
	}
	
}
