package com.xworkz.Encapsulation;

public class FishTester {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish name = new Fish(0,"fish", "mangalore");
		//Fish name = new //Fish();
		System.out.println(name.getID());
		System.out.println(name.getfishtype());
		System.out.println(name.getplace());
		
		//name.name="nam";
		Fish n = new Fish("Fish");
		System.out.println(n);
	}

}
