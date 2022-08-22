package com.xworkz.Abstraction;

//abstract class
public abstract class CentralGovt {
	// we don't have abstract variables
	// we can have both concrete and non concrete method in abstract class 
	//in normal class we can't declare abstract methods
	//abstract method 
	protected abstract void stateGovt();

	//concrete method 
	void getFund() {
		System.out.println("central govt funded 50crore for each state");
	}
	
}
