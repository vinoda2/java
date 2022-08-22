package com.xworkz.Assignment;
//Assignment 1
public class DominoPizza {
	
	//achieving encapsulation by using private access modifiers
	private int orderNumber;
	private double price;
	private String orderList;
	private static int orderCount=1;
	
	public DominoPizza(int orderNumber,double price,String orderList) {
		this.orderNumber=orderNumber;
		this.price=price;
		this.orderList=orderList;
	}	
	//setters to set the values to the private variables
	public void setOrderNumber(int order) {
		orderNumber=order;
	}
	public void setPrice(double pizzaPrice) {
		price=pizzaPrice;
	}
	public void setOrderList(String item) {
		orderList=item;
	}
	public void setOrderCount(int count) {
		orderCount=count;
	}
	
	//getters to get the values 
	public int getOrderNumber() {
		return orderNumber;
	}
	public double getPrice() {
		return price;
	}
	public String getOrderList() {
		return orderList;
	}
	public int getOrderCount() {
		return orderCount;
	}
	
	void order() {	
		if (orderCount==0) {
		System.out.println("This is your first order, order the pizza and sides:");
		orderCount++;
		orderNumber=2;
		}else {
			System.out.println("your not eligable for discount:");
			System.out.println("still you can order");
			orderCount++;
		}	
		orderNumber++;
	}
	
	void discount() {
		if(orderCount==1) {
			System.out.println("Hurry now you can claim 50% discount");
		}else {
			System.out.println("you can claim 10% discount");
		}
	}
	
	void calculateGST(int price) {
		int totalAmount=price;
		if(price<=500) {
			System.out.println("GST not applicable");
		}else if(price<=1000) {
			totalAmount+=(1000*0.10);
			System.out.println("GST is 10% and total amount is:"+totalAmount);
		}else {
			totalAmount+=(price*0.15);
			System.out.println("GST is 18% and total amount is:"+totalAmount);
		}
	}
	
}
