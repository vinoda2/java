package com.xworkz.Assignment.DTO;

public class BankDaoImplementation extends BankDAO{

	//abstract method implementation
	@Override
	protected void checkBalance(double balance) {
		if(balance==0) {
			System.out.println("you having zero balance");
		}else if(balance<=-1) {
			System.out.println("your not maintaining balance");
		}else {
			System.out.println("your balance is:"+balance);
		}
	
	}
	//abstract method implementation
	@Override
	protected void readDTO() {
		System.out.println("reading data from an array:");
		for(int i=0;i<dtos.length;i++) {
			System.out.println(dtos[i]);
		}
		
	}

	public void getBalance(double balance,double withdraw) {
		if(balance<withdraw) {
			System.out.println("insuffiecient balance");
		}else {
			balance=balance-withdraw;
			System.out.println("balance:"+balance);
		}
	}
	
	public void checkAccountNumber(long accountNumber) {
	
		int length = String.valueOf(accountNumber).length();
		if(length<10) {
			System.out.println("enter the valid account number");
		}else {
			System.out.println("account number is:"+accountNumber);
		}
	}
}
	

