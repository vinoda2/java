package com.xworkz.Abstraction;

public class AxisBank extends Bank{

	AxisBank(){
		super("amar",855, "Axis582","Axis284BK","JPnagar","SB",
				5000);
	}
	@Override
	public double loanInterest() {
		System.out.println("Axis Bank Personal loan:12%");
		return 0;
	}

}
