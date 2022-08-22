package com.xworkz.Arrays;

public class LinearSearch {
	
	void linearsearch(int[] array, int searchNumber) {
		
		for(int i=0;i<array.length;i++)
		{
			if(searchNumber==array[i]) {
				
				System.out.println("element find at the index:"+i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {23,45,67,78,89,90,12,4,56,67};
		int searchNumber=23;
		LinearSearch search=new LinearSearch();
		search.linearsearch(array,searchNumber);
	}
}

