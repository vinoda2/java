package com.xworkz.singletonDesign;

public class SingletonDriver {

	public static void main(String[] args) {
		//we can't create object bcz class contains private constructor
		//SingletonDesign name = new SingletonDesign ();
		
		//but we can access the methods with the help of class name
		SingletonDesign s=SingletonDesign.getSingletonDesign();
		
		System.out.println(s.getSingletonDesign());

	}

}
