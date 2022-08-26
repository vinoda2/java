package com.xworkz.exception.driver;

public class ValueException {

	//without catch and finally block we can't run try block
	public static void main(String[] args) {
		String name="Lapto";
		try {
			if(name.endsWith("p")) {
				System.out.println("name is:"+name);
			}
		}catch(Exception e) {
			System.out.println("name error"+e);
		}finally{
			System.out.println("finally block");
		}
	}

}
