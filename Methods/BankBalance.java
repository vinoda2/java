package com.xworkz.Methods;

public class BankBalance {
	String name;
	int accout_no;
	String branch;
	float balance;
	
	
	float getBalance(float balance) {
		return balance;
		
	}
	
	void checkBalance(float balance) {
		if(balance<1000) {
			System.out.println("maintain minimum balance ");
		}else {
			System.out.println("balance available");
		}
	}
}
