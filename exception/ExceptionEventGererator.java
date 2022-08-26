package com.xworkz.exception;

public class ExceptionEventGererator {

	public void eventCreator() throws Exception {
		System.out.println("Exception even creator method");
		Exception exception = new Exception();
		throw exception;
	}
}
