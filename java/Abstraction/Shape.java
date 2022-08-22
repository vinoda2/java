package com.xworkz.Abstraction;

public class Shape {
	//void shape();//this is concrete method it must have body 
	
	//abstract void shape() {}// this is abstract method it doesn't contain method or no implementation
	
	static void display() {
		System.out.println("this is static concrete method");
	}
	
	void display1() {
		System.out.println("instance concrete method");
	}
	
	//abstract void shape(); // this is a abstract class it must defined in abstract class itself not in normal class
	
	public static void main(String args[]) {
		Shape s = new Shape();
		s.display1();
		Shape.display();
		
	}
}
