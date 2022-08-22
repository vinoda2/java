package com.xworkz.constructor;

public class Snacks {
	private int id;
	private int orderQuatity;
	private double price;
	private String[] snacksList= {"pani puri","gobbi","bell puri","vadapavu","samosa masala"};
	
	Snacks(int id,int orderNumber,double price,String[] snacksList){
		this.id=id;
		this.orderQuatity=orderNumber;
		this.price=price;
		this.snacksList=snacksList;
	}
	
	void setID(int ID) {
		id=ID;
	}
	void setOrderQuatity(int order) {
		orderQuatity=order;
	}
	void setPrice(double prices) {
		price=prices;
	}
	void setSnacksList(String[] itemList) {
		snacksList=itemList;
	}
	int getId() {
		return id;
	}
	
	double getPrice() {
		return price;
	}
	
	String[] getSnacksList() {
		return snacksList;
	}
	
	int getOrderQuatity() {
		return orderQuatity;
	}
}
