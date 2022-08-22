package com.xworkz.Variables;

//we can change variable value in any time
public class Hello {

	//static variable
	static int a;
	
	//instance variable
	int b;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello h = new Hello();
		//not initialized static variable
		System.out.println(Hello.a);//output 0
		
		//initializing the static variable
		System.out.println(Hello.a=10);//output 10
		
		
		//not initialized instance variable
		System.out.println(h.b);//output 0
				
		//initializing the instance variable 
		System.out.println(h.b=20);//output 10
	}

}
