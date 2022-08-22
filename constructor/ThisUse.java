package com.xworkz.constructor;

//we can use This keyword word to access instance variable and methods, constructor chaining
public class ThisUse {

	static int a=30;
	int b=40;
	
	void show() {
		int a=20;
		String b="Hello";
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("using this keyword we are accessing static and instance variables");
		//System.out.println(this.a); // we can access static variable using This keyword but it is a not good standart
		
		System.out.println(ThisUse.a);
		System.out.println(this.b);
	}
	
	void message() {
		System.out.println("calling with the help of this keyword");
		this.show();//calling method using this keyword
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisUse use = new ThisUse();
		use.message();
	}

}
