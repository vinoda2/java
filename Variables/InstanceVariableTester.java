package com.xworkz.Variables;

public class InstanceVariableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable variable = new InstanceVariable();
		
		//accessing instance variables by using reference variable
		System.out.println(variable.id=11);
		System.out.println(variable.name="Computer");
		
		//accessing instance method
		variable.instanceMethod();
		
	}

}
