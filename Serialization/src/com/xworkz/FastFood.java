package com.xworkz;

import java.io.Serializable;

//if we are not implementing Serializable then you will get ->"Exception in thread "main" java.io.NotSerializableException: com.xworkz.FastFood
public class FastFood implements Serializable{

	
	private int id;
	private String itemName;
	private double price;

	//if we variable is transient then it won't stores null value instead original value
	//we can use this for passwords, ATM pins
	private transient String password;
	
	public FastFood(int id, String itemName, double price,String password) {
		this.id = id;
		this.itemName = itemName;
		this.price = price;
		this.password=password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}
	public String getPassword() {
		return password;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
