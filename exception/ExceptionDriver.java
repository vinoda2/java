package com.xworkz.exception;

public class ExceptionDriver {

	public static void main(String args[]) throws Exception {
		ExceptionEventGererator event = new ExceptionEventGererator();
		event.eventCreator();
	
		
	} 

}
//public static void createAccount(String username, String password) {
	//user throw key word to create new exception
	//try all the exception, checked, unchecked,
	//today task we need to do all the methods as abstract (CURD-save, find duplicate,delete,update)
	//write abstract methods implementation in CURDImplementation 
	//abstraction
// try and catch
//try and multiple catch
//try and multi catch- in same catch block we can handle more then one exception at a time but all exception should be in same level
//sub class of exception-nullpointerexception,
//finally block -it always executed, when cases will not execute(1-memory 1.system.exit(-1)-whole program will crash)
//