package com.xworkz.Methods;

public class BankBalanceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object creation
		BankBalance balance = new BankBalance();
		balance.accout_no=12456;
		balance.name="Lenova";
		balance.branch="IDFC";
		System.out.println(balance.name);
		System.out.println(balance.accout_no);
		System.out.println(balance.branch);
		
		float bal=balance.getBalance(500);
		System.out.println(bal);
		
		//reusing the return value
		balance.checkBalance(bal);
	}

}
