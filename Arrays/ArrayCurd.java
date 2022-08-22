package com.xworkz.Arrays;

public class ArrayCurd {
	
	String[] array=new String[10];
	void saveName(String name) {
		array[0]=name;
		array[1]=name;
		array[2]=name;
		array[3]=name;
		array[4]=name;
		array[5]=name;
		array[6]=name;
		array[7]=name;
		array[8]=name;
	}
	
	//read elements from an array
	String readArray(String name) {
		for(int i=0;i<array.length;i++)
		{
			if(name.equals(this.array[0])) {
				return this.array[0];
			}
		}
		return null;
	}
	
	//update arraylist
	void updateArrayElements(String[] array,String name) {
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==name) {
				array[i]="happy";
			}
		}
	}
	//delete function
	public String delete(String[] array,String name) {
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==name) {
				String deleteName=array[i]=" ";
				return deleteName;
			}
		}
		return null;
	}
}
