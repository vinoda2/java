package com.xworkz.inferfacesone;

public interface KeyBoard {

	//final variable
	public static final String name="keyboard";
	
	//abstract method without abstract 
	void keyBoardStandart();
	
	//interface allow only default and static methods
	default void run() {
		System.out.println("this is first run method");
	}
	
	static void brand() {
		System.out.println("key board brand");
	}
}
