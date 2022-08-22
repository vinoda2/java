package com.xworkz.methodoverloading;

public class PhonePay {
	public void recharge(long number, int amount) {
		System.out.println("phone recharge successful");
	}
	
	public void recharge(String cardNumber, int amount) {
		System.out.println("DTH recharge successful");
	}

	public void recharge(Long number) {
		System.out.println("Postpaid bill paid");
	}
	
	public void recharge(String userID) {
		System.out.println("Wifi recharge successful");
	}
}
