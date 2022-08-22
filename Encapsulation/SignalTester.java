package com.xworkz.Encapsulation;

public class SignalTester {

	public static void main(String[] args) {
		Signal s = new Signal("red","Mysore",3);
		s.setColor("green");
		System.out.println(s.getColor());
		
		s.setColour("white");
		String col= s.getColor();
		System.out.println(col);
	}

}
