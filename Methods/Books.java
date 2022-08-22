package com.xworkz.Methods;

public class Books {
	int id;
	String bookname;
	int pages;
	String author;
	double price;
	
	//Method without parameter and return
	void bookName() {
		System.out.println("book name is:"+bookname);
	}
	
	//method without parameter and with return type
	int returnId() {
		return id;
	}
	
	//method with parameter and with return type
	String authorName(String author) {
		//System.out.println("author name is:"+author);
		return author;
	}
	
	//method with parameter and without return type
	void bookPrice(double price) {
		System.out.println("book price:"+price);
	}
	
	
	
	
	

}
