package com.xworkz.Abstraction;

public class SBIBank extends Bank{
	
	SBIBank(){
		super("anamika",855, "SBI582","SBI284BK","JPnagar","SB",
				5000);
	}

	@Override
	public double loanInterest() {
		System.out.println("SBI Bank Personal loan:10%");
		return 0;
	}
	
}
