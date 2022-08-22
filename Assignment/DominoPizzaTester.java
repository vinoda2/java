package com.xworkz.Assignment;

//Assignment 1

public class DominoPizzaTester {

	public static void main(String[] args) {
		
		//object array
		DominoPizza[] domino=new DominoPizza[5];
		
		//creating a object
		DominoPizza pizza0 = new DominoPizza(10,5000,"paneer");
		DominoPizza pizza1 = new DominoPizza(11,500,"chicken");
		DominoPizzaMain pizza2 = new DominoPizzaMain();
		DominoPizzaMain pizza3 = new DominoPizzaMain();
		DominoPizza pizza4 = new DominoPizzaMain();
		
		//adding object to object array
		domino[0]=pizza0;
		domino[1]=pizza1;
		domino[2]=pizza2;
		domino[3]=pizza3;
		domino[4]=pizza4;
		
		//calling methods 
		for(int i=0;i<domino.length;i++) {
			if(i==0) {
				System.out.println(domino[0].getOrderNumber());
				System.out.println(domino[0].getOrderCount());
				System.out.println(domino[0].getOrderList());
				System.out.println(domino[0].getOrderNumber());
				System.out.println(domino[0].getPrice());
				pizza0.calculateGST(500);
				pizza0.discount();
			}else if(i==1) {
				System.out.println(domino[1].getOrderNumber());
				System.out.println(domino[1].getOrderCount());
				System.out.println(domino[1].getOrderList());
				System.out.println(domino[1].getOrderNumber());
				System.out.println(domino[1].getPrice());
				pizza1.calculateGST(5000);
				pizza1.discount();
			}else if(i==2) {
				System.out.println(domino[2].getOrderNumber());
				System.out.println(domino[2].getOrderCount());
				System.out.println(domino[2].getOrderList());
				System.out.println(domino[2].getOrderNumber());
				System.out.println(domino[2].getPrice());
				pizza2.calculateGST(5000);
				pizza2.discount();
			}else if(i==3) {
				System.out.println(domino[3].getOrderNumber());
				System.out.println(domino[3].getOrderCount());
				System.out.println(domino[3].getOrderList());
				System.out.println(domino[3].getOrderNumber());
				System.out.println(domino[3].getPrice());
				pizza3.calculateGST(500);
				pizza3.discount();
			}else if(i==4) {
				System.out.println(domino[4].getOrderNumber());
				System.out.println(domino[4].getOrderCount());
				System.out.println(domino[4].getOrderList());
				System.out.println(domino[4].getOrderNumber());
				System.out.println(domino[4].getPrice());
				pizza4.calculateGST(1000);
				pizza4.discount();
			}
			
		}
	}

}
