package com.xworkz.Encapsulation;

public class Fish {

	private int id;
	private String fishtype;
	private String place;
	private String name;
	
	//constructor
	Fish(String name){
		this.name=name;
		//System.out.println("name:"+name);
	}
	
	Fish(int id, String fishtype,String place){
	
		this.id=id;
		this.fishtype=fishtype;
		this.place=place;
	}
	
	//setters 
	void setID(int ID) {
		id=ID;
	}
	
	void setName(String fishname) {
		name=fishname;
	}
	public void setfishtype(String fish) {
		fishtype=fish;
	}
	
	public void setplace(String orderplace) {
		place=orderplace;
	}
	
	//getters
	public int getID() {
		return id;
	}
	
	public String getfishtype() {
		return fishtype;
	}
	String getplace() {
		return place;
	}
	
	public String getName() {
		return name;
	}
}


