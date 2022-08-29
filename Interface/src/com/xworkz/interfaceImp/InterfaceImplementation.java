package com.xworkz.interfaceImp;

import com.xworkz.interfaceone.Slipers;

public class InterfaceImplementation implements Slipers  {

	@Override
	public void brand() {
		System.out.println("BATA slipers");
		
	}

	@Override
	public void run() {
		System.out.println("i'm a runner");
		
	}

}
