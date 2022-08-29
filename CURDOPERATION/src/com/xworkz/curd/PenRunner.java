package com.xworkz.curd;

import com.xworkz.curd.dao.PenDAO;
import com.xworkz.curd.dao.PenImplementation;
import com.xworkz.curd.dto.PenDTO;

public class PenRunner {

	public static void main(String[] args) {
		PenDTO pen = new PenDTO();
		pen.setBrand(null);
		pen.setColor(null);
		pen.setPrice(0);
		
		PenDAO pdao = new PenImplementation();
		pdao.saveDTO(pen);
		
		PenDTO pen1 = new PenDTO();
		pdao.saveDTO(pen1);
		
		PenDTO pen2 = new PenDTO();
		pdao.saveDTO(pen2);
		
		pdao.readDTO();
		
		pdao.deleteDTO(pen1);
		pdao.readDTO();
		
		PenDTO pen3 = new PenDTO();
		pdao.saveDTO(pen3);
		
		pen3.setBrand("micro");
		pen3.setColor("blue");
		pen3.setPrice(50);
		pdao.saveDTO(pen3);
		pdao.readDTO();
		pdao.updateDTO(pen2, pen3);
		pdao.readDTO();
		
		
		
	
		

	}

}
