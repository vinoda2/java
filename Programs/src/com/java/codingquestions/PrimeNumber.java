package com.java.codingquestions;

public class PrimeNumber {
	public void checkPrimeNumber(int num) {
		int count = 0;
		if(num==0||num==1) {
			System.out.println("enter the correct number");	
		}
		else{
			for(int i=2;i<num;i++) {
				if(num/i==0) {
					count=count+1;
					}
				}
		}
		if(count==2) {
			System.out.println(" prime number");
		}else {
			System.out.println("not a prime number");
		}
	}
	
	
	
	public static void main(String args[]) {
		int number=6;
		PrimeNumber n = new PrimeNumber();
		n.checkPrimeNumber(number);
	}
}
