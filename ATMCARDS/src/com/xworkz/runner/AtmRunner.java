package com.xworkz.runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.xworkz.atmcard.dao.AtmDAOImplements;
import com.xworkz.atmcard.dto.AtmDTO;
import com.xworkz.service.AtmService;
import com.xworkz.service.AtmServiceImplementation;

public class AtmRunner {
	 
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		AtmDTO dto = new AtmDTO(123,"12-10-2022",21545454l,154);
		//AtmDAOImplements dao = new AtmDAOImplements();
		
		AtmService service = new AtmServiceImplementation();
		service.validateData(dto);
		
		FileOutputStream file=new FileOutputStream("objectList.txt");
		ObjectOutputStream objout=new ObjectOutputStream(file);
		objout.writeObject(dto);
		
		FileInputStream files=new FileInputStream("objectList.txt");
		ObjectInputStream objin=new ObjectInputStream(files);
		AtmDTO dt=(AtmDTO)objin.readObject();
	}
}
