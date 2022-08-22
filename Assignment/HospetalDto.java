package com.xworkz.Assignment;

public class HospetalDto {
	
	private int numberOfStaff;
	private int numberofP;
	private int beds;
	private int numberofDepartement;
	/*
	public HospetalDto(int numberOfStaff, int numberofP, int beds, int numberofDepartement) {
		
		this.numberOfStaff = numberOfStaff;
		this.numberofP = numberofP;
		this.beds = beds;
		this.numberofDepartement = numberofDepartement;
	}
	*/
	public int getNumberOfStaff() {
		return numberOfStaff;
	}
	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	public int getNumberofP() {
		return numberofP;
	}
	public void setNumberofP(int numberofP) {
		this.numberofP = numberofP;
	}
	public int getBeds() {
		return beds;
	}
	public void setBeds(int beds) {
		this.beds = beds;
	}
	public int getNumberofDepartement() {
		return numberofDepartement;
	}
	public void setNumberofDepartement(int numberofDepartement) {
		this.numberofDepartement = numberofDepartement;
	}

	@Override
	public String toString() {
		return "HospetalDto [numberOfStaff=" + numberOfStaff + ", numberofP=" + numberofP + ", beds=" + beds
				+ ", numberofDepartement=" + numberofDepartement + "]";
	}
	
}
