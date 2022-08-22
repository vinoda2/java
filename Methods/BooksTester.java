package com.xworkz.Methods;

public class BooksTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book = new Books();
		book.id=1;
		book.bookname="Java";
		book.pages=500;
		book.author="xyz";
		book.price=500.50;
		
		book.bookName();
		
		book.bookPrice(500.20);
		
		String str=book.authorName(null);
		System.out.println("another name:"+str);
		
		int a=book.returnId();
		System.out.println("book id:"+a);
		
	}

}
