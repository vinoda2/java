package com.xworkz.Assignment;

public class Flower {
	String flowerName;
	String flowerType;
	String placeOfGrowing;
	
	public Flower(String flowerName,String flowerType,String placeOfGrowing) {
		this.flowerName=flowerName;
		this.flowerType=flowerType;
		this.placeOfGrowing=placeOfGrowing;
	}
	
	void getavailability() {
		System.out.println("Available ");
	}
	
	@Override
	public String toString() {
		return ("flower name:"+flowerName+"flower type:"+flowerType+"place of growing:"+placeOfGrowing);
	}
	
	/*public boolean equals(Object obj) {
		if(obj instanceof Flower) {
		return true;
		}else {
			return false;
		}
		*/
	public boolean equals(Object obj) {
		if(obj!=null) {
			return true;
		}
		return false;
	}

}
	

