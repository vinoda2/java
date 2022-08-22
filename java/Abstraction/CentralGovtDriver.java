package com.xworkz.Abstraction;

public class CentralGovtDriver {

	public static void main(String[] args) {
		//we can't create object for a type of abstract class
		//CentralGovt govt = new CentralGovt();
		
		//polymorphism 
		CentralGovt govt = new Karnataka();
		govt.stateGovt();
		
		CentralGovt govt1 = new AndraPradesh();
		govt1.stateGovt();
		govt1.getFund();
	}

}
