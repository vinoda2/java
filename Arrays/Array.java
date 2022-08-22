package com.xworkz.Arrays;


public class Array {

	//
	static int[] array= {};//without defining size
	int[] array1= {};//without defining size
	
	int intArray[]=new int[20];  // allocating memory to array
	
	static int staticArrayLength() {
		return array.length;
		}
	
	int arrayLength() {
		return array1.length;
		}
	
	int arrayLengthof() {
		return intArray.length;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array array = new Array();
		int instanceArrayLen=array.arrayLength();
		System.out.println("instance aarray length:"+instanceArrayLen);
		
		System.out.println("instance aarray length:"+Array.staticArrayLength());
		
		int arrayLen=array.arrayLengthof();
		System.out.println("instance aarray length:"+arrayLen);
		

	}

}
