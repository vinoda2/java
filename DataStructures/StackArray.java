package com.xworkz.DataStructures;

//implementing stack using arrays
public class StackArray {
	int top=-1;
	int buttom=0;
	int stackarray[]= new int[10];
	int len=stackarray.length;
	
	void push(int ele) {
		if (top==len) {
			System.out.println("stack overflow");
		}else {
			top++;
			stackarray[top]=ele;
			System.out.println("element inserted");

		}
	}
	
	void pop(int ele) {
		if(top==-1) {
			System.out.println("stack is empty");
		}else {
			ele=stackarray[top];
			top--;
		}
		System.out.println("element deleted");
	}
	
	void printElements() {
		for(int i=0;i<len;i++) {
			System.out.println(stackarray[i]);
		}
	}
	
}
