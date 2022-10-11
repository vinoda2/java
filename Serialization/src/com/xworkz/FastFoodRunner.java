package com.xworkz;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import javax.imageio.stream.FileImageInputStream;

public class FastFoodRunner {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FastFood food = new FastFood(1,"gobi",30,"gobi@132");
		
		//Serializing the object into file
		FileOutputStream file=new FileOutputStream("object.txt");
		ObjectOutputStream out=new ObjectOutputStream(file);
		out.writeObject(food);
		System.out.println(food.getId());
		System.out.println(food.getItemName());
		System.out.println(food.getPrice());
		System.out.println(food.getPassword());
		System.out.println("state of an object saved successfully");
		
		//De-Serializing
		FileInputStream files=new FileInputStream("object.txt");
		ObjectInputStream input=new ObjectInputStream(files);
		FastFood f=(FastFood)input.readObject();
		System.out.println(f.getId());
		System.out.println(f.getItemName());
		System.out.println(f.getPrice());
		System.out.println(f.getPassword());
		System.out.println("object de-serialized successfully");
	}

}
