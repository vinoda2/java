package com.xworkz.practice;

public class ReverseNumber {

	public void reverseNumber(int num) {
		// TODO Auto-generated method stub
		//incomplete
		while(num!=0) {
			num=num%10;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber number = new ReverseNumber();
		number.reverseNumber(5864);

	}
}
