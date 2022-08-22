package com.xworkz.String;

public class StringPractice {
	
	String str="xworkz";
	String str1="xworkz";
	static String str2="xwork";
	
	public static void main(String args[])
	{
		StringPractice name = new StringPractice();
		
		System.out.println(name.str);
		System.out.println(name.str1);
		System.out.println(name.str==name.str1);
		System.out.println(name.str.equals(name.str1));
		
		System.out.println(name.str1==str2);
		
		System.out.println(name.str.length());
		System.out.println(name.str1.length());
		
		String s=name.str.concat("bangalore");
		System.out.println(s);
		System.out.println(s==name.str);
		
		System.out.println(s.equals(name.str));
		
		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		System.out.println(sb.isEmpty());
		
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println(sb1);
		
		System.out.println(sb==sb1);
		
		System.out.println();
		System.out.println(sb.isEmpty());
		System.out.println(sb.length());
		System.out.println("index value:"+sb.indexOf("l"));
		System.out.println(sb.reverse());
		
		String str=new String("welcome");
		System.out.println(str);
		
		
	}

}
