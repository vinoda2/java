package com.xworkz.Poly;

public class PhonePayTester {

	public static void main(String[] args) {
		
		//achieving compile time polymorphism with method overloading
		PhonePay recharge = new PhonePay();
		recharge.recharge(999,500);
	}

}
