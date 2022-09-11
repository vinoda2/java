package com.xworkz.enumkeyword;

//creating enums
enum IceCream{
	Kulfi,Candy,Cup_Ice;
}
public class EnumMonth {

	public static void main(String[] args) {
		/* we can't create enum inside the method, It should be created class level or static level
		enum Steps{
			step1,step2;
		}*/

		//calling Enum values 
		Month m = Month.April;
		Month m1 = Month.August;
		Month m2 = Month.December;
		Month m3 = Month.October;
		Month m4 = Month.Februay;
		IceCream ice=IceCream.Cup_Ice;
		
		//printing values
		System.out.println(m);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(ice);
	}

}
