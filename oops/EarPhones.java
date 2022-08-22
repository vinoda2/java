package com.xworkz.oops;

/*exploring the class members
 * 1.variables  execution order 3
 * 2.Blocks(static, instance) execution order 1
 * 3.Constructor execution order 2
 * 4.Methods execution order 4
 * 5.InnerClass execution order 5 or when we call the methods or variables
 * we can have multiple static and instance block in same class
*/
public class EarPhones {
	//instance variables
	int id;
	String name;
	String colour;
	
	//static variables
	static double price;
	
	//Constructor
	public EarPhones() {
		System.out.println("default constructor");
	}
	
	public EarPhones(String name) {
		this.name=name;
		System.out.println("parameterized contructor");
	}
	
	//methods
	void getReview() {
		System.out.println("* * * *");
	}
	
	//Block 
	{
		System.out.println("I'm a Earphone block and class member");
	}
	//first static block will execute
	static {
		System.out.println("I'm a static block");
	}
	
	//Block 
		{
			System.out.println("I'm a Earphone block and class member");
		}
		//first static block will execute
		static {
			System.out.println("I'm a static block");
		}
	//inner class
	class Type{
		void getType() {
			System.out.println("I'm a inner class ");
			System.out.println("wireless earphones");
		}
	}
	
	//main method
	public static void main(String args[])
	{
		EarPhones ear = new EarPhones();//outer class object
		EarPhones.Type inner= ear.new Type();// inner class object creation OuterClassReference.new MemberInnerClassConstructor();  
		ear.id=12;
		ear.name="One Pluse";
		ear.colour="Block";
		System.out.println("Id :"+ear.id+" "+"name:"+ear.name+" color:"+ear.colour);
		ear.getReview();
		inner.getType();
		
		//local variables
		String localVariable="I'm a local variable";
		System.out.println(localVariable);
		
		//local Blocks 
		{
			System.out.println("I'm a local block");
		}
		//local Blocks 
		{
			System.out.println("I'm a local block");
		}
	}
}
