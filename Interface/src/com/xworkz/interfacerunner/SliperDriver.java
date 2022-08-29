package com.xworkz.interfacerunner;

import com.xworkz.interfaceImp.InterfaceImplementation;
import com.xworkz.interfaceone.Slipers;


public class SliperDriver {

	public static void main(String[] args) {
		//we can't create object for interfaces
		//Slipers name = new Slipers();
		InterfaceImplementation int1 = new InterfaceImplementation();
		int1.brand();
		int1.hashCode();
		int1.run();
		Slipers.types;
	}
}
