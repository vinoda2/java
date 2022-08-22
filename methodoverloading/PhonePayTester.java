package com.xworkz.methodoverloading;

public class PhonePayTester {

	public static void main(String[] args) {
		
		//achieving compile time polymorphism with method overloading
		PhonePay recharge = new PhonePay();
		recharge.recharge(999,500);
		recharge.recharge("ABC856");
		recharge.recharge(2579246, 200);
		recharge.recharge("DHTART5325", 1200);
		
	}

}
