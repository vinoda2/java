package com.xworkz.Encapsulation;

public class Signal {
	private String color;
	private String location;
	 int noOfSignals;
	
	
	public Signal(String string, String string2, int number) {
		this.color=string;
		this.location=string2;
		this.noOfSignals=number;
	}


	@SuppressWarnings("unused")
	private void getSignal() {
		System.out.println("All signals are ON");
	}
	
	void setColor(String col)
	{
		this.color=col;
		
	}
	void setColour(String col)
	{
		this.color=col;
	}
	void setLocation(String loc) {
		location=loc;
	}
	
	String getColor() {
		return color;
	}
	public String getLocation() {
		return location;
	}
}
