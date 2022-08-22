package com.xworkz.Abstraction;

public class ICICIBank extends Bank {

	ICICIBank(){
		super("Bhoomika",855, "ICICI582","ICICI284BK","JPnagar","SB",
				5000);
	}
	@Override
	public double loanInterest() {
		System.out.println("ICICI Bank Personal loan:9%");
		return 0;
	}

}
