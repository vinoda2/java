package com.xworkz.Arrays;

public class ArrayIndex {

	void arrayValue() {
		String name="xworkz";
		String array[]= {"name","noon","xworkz","array"};
		for(int i=0;i<array.length;i++) {
			if(name==array[i]) {
				System.out.println("xworkz is present inside the array:"+array[i]+" "+"index value:"+i);
			}
		}
	}
}
