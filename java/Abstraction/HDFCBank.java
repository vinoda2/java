package com.xworkz.Abstraction;

public class HDFCBank extends Bank {

	HDFCBank(){
		super("amika",855, "HDFC582","HDFC284BK","JPnagar","SB",
				5000);
	}
	@Override
	public double loanInterest() {
		System.out.println("HDFC Bank Personal loan:11%");
		return 0;
	}

}
