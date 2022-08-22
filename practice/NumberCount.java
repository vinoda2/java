package com.xworkz.practice;

public class NumberCount {

	public int numberCount(int num) {
		int count=0;
		while(num!=0) {
		 	num=num%10;
		 	num=num/10;
		 	count++;	
		}
		return count;
		
	}
	public int sumDigits(int n){
	     int sum = 0;
	     while(n>0){
	       sum+=n%10;
	       n/=10;
	     }
	     return sum;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCount name = new NumberCount();
		int count=name.numberCount(25678);
		System.out.println("digits present in the nummber:"+count);
		int num=81;
		int sum=name.sumDigits(num);
		int square=sum^2;
		if (square==num) {
		System.out.println("sum :"+sum);
		}else {
			System.out.println("not");
		}
	}

}
