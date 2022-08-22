package com.xworkz.constructor;

public class SnacksTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] itemList= {"pani puri","gobbi","bell puri","vadapavu","samosa masala"};
		Snacks s= new Snacks(12,5,600,itemList);
		s.setID(2);
		System.out.println(s.getId());
		s.setOrderQuatity(6);
		for (int i=0;i<=itemList.length;i++)
		{
			System.out.println(s.getSnacksList());
		}
		s.setPrice(700);
		System.out.println(s.getSnacksList());
	}

}
