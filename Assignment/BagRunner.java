package com.xworkz.Assignment;

public class BagRunner {

	public static void main(String[] args) {
		Bag b = new Bag("black",1234);//bag class reference variable
		System.out.println(b.color);
		System.out.println(b.hight);
		
		Bag b1 = new Bag();//parent 
		NikeBag n = new NikeBag();//child
		WildCraftBag w = new WildCraftBag();//child
		System.out.println(b1);
		System.out.println(w);
		//NikeBag n1=(NikeBag)b1;//parent to child
		
		Bag b2=(Bag)n;//child to parent
		System.out.println(b2 instanceof Bag);//false
		System.out.println(b.toString());
	
		WildCraftBag wc = new WildCraftBag();//wildcraftbag class reference variable
		
		
		NikeBag nb = new NikeBag();//Nikebag class reference variable
	
		
		//java.lang.ClassCastException
		//WildCraftBag b1=(WildCraftBag)b;
		System.out.println(b.getClass());
		
		//object type casting 
		
		b=(Bag)wc; //casting from Wildcraft to Bag reverse will get error =>ClasscastException
		System.out.println(b.getClass());//WildcraftBag
		//System.out.println(wc.getClass());//
		System.out.println(wc instanceof Bag);//true checking whether b is a object of class bag
		
		//casting from nike to Bag 
		b=(Bag)nb;
		System.out.println(nb instanceof Bag);

	}

}
