package com.xworkz.Abstraction;

public class BankDriver {

	public static void main(String[] args) {
		//Bank name = new Bank();// we can't create object for abstract class
		SBIBank sbi = new SBIBank();
		HDFCBank hdfc = new HDFCBank();
		ICICIBank icici = new ICICIBank();
		AxisBank axis = new AxisBank();
		sbi.loanInterest();
		hdfc.loanInterest();
		icici.loanInterest();
		axis.loanInterest();
		System.out.println("=====SBI bank account holder details===");
		System.out.println(sbi.getAccountNo());
		System.out.println(sbi.accountType);
		System.out.println(sbi.name);
		System.out.println(sbi.branchName);
		System.out.println(sbi.ifscCode);
		System.out.println(sbi.microCode);
		System.out.println(sbi.balance);
		//calling concrete method
		sbi.openAccount(52);
		sbi.checkBalance(200);
		
		System.out.println("=====HDFC bank details===");
		System.out.println(hdfc.accountNo);
		System.out.println(hdfc.accountType);
		System.out.println(hdfc.name);
		System.out.println(hdfc.branchName);
		System.out.println(hdfc.ifscCode);
		System.out.println(hdfc.microCode);
		System.out.println(hdfc.balance);
		
		
		System.out.println("====ICICI bank details====");
		System.out.println(icici.accountNo);
		System.out.println(icici.accountType);
		System.out.println(icici.name);
		System.out.println(icici.branchName);
		System.out.println(icici.ifscCode);
		System.out.println(icici.microCode);
		System.out.println(icici.balance);
		icici.checkBalance(6000);
		icici.loanInterest();
		
		System.out.println("====Axis bank====");
		System.out.println(axis.accountNo);
		System.out.println(axis.accountType);
		System.out.println(axis.name);
		System.out.println(axis.branchName);
		System.out.println(axis.ifscCode);
		System.out.println(axis.microCode);
		System.out.println(axis.balance);
		axis.checkBalance(500);
		axis.loanInterest();
		
		
	}

}
