package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListExample {

	public static void main(String[] args) {
		
		//ArrayList
		Collection <Object> col=new ArrayList();
		col.add("vinoda");
		col.add("abs");
		col.add("sdd");
		col.add("sdd");
		
		//printing ArrayList
		System.out.println(col);
		if(col.contains("sdd")) {
			System.out.println("word is present inside the text");
		}else {
			System.out.println("not present");
		}
		
		//printing values 
		int n=col.size();
		forEach(n);{
		System.out.println(col);
		}
		
		//removing objects from the object ArrayList
		col.remove("sdd");
		System.out.println(col);
		
		//printing the hashCode of the ArrayList Object
		System.out.println(col.hashCode());
		
		//counting the number of object present in the arrayList
		System.out.println(col.size());

		//to display the object in side the ArrayList
		System.out.println(col.toString());
		
		//checking whether ArrayList is empty r not
		System.out.println(col.isEmpty());
		
		//it display the class name of the given object
		System.out.println(col.getClass());
		
		//set interface
		Set <Object> set=new TreeSet();
		set.add("abc");
		set.add("abc");
		set.add("xyz");
		
		//set not allow duplicate values
		if(set.contains("abc")) 
		{
			System.out.println("word is present inside the text");
		}else {
			System.out.println("not present");
		}
		int n1=set.size();
		forEach(n1);{
		System.out.println(set);
		}	
	}
		
	private static void forEach(int n) {
		// TODO Auto-generated method stub
	}	
}
