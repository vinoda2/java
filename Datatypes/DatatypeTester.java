package com.xworkz.Datatypes;

public class DatatypeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datatypes type=new Datatypes();
		System.out.println(type.b);// default values  0
		System.out.println(type.s);//0
		System.out.println(type.i);//0
		System.out.println(type.f);//0.0
		System.out.println(type.d);//0.0
		System.out.println(type.c);//space
		System.out.println(type.bool);//false
		
		System.out.println(type.str);//null
		
		
		type.assignValue();

	}

}
