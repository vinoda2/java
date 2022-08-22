package com.xworkz.constructor;

public class BattleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battle battle=new Battle();
		battle.id=2;
		battle.name="Silver battle";
		battle.brand_name="Pure";
		battle.price=500.00;
		
		System.out.println(battle.id);
		System.out.println(battle.name);
		System.out.println(battle.brand_name);
		System.out.println(battle.price);
		
		battle.getDetails();
		
		//calling parameterized constructor
		Battle battle1 = new Battle(3,"Golden battle","topper ware",1000.50);
		System.out.println(battle1.id);
		System.out.println(battle1.name);
		System.out.println(battle1.brand_name);
		System.out.println(battle1.price);
		battle1.getDetails();
	}

}
