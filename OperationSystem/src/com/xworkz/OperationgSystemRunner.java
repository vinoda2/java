package com.xworkz;

import com.xworkz.dao.OperationgSystem;
import com.xworkz.dao.OperationgSystemImp;
import com.xworkz.dto.OperationgSystemDTO;

public class OperationgSystemRunner {

	public static void main(String[] args) {
		OperationgSystemDTO dto= new OperationgSystemDTO("windows", "10V", "Microsoft");
		OperationgSystem dao = new OperationgSystemImp();
		dao.saveDTO(dto);
		dao.readDTO();
		OperationgSystemDTO dto1= new OperationgSystemDTO("windows", "10V", "Microsoft");
		OperationgSystemDTO dto2= new OperationgSystemDTO("windows", "10V", "Microsoft");
		OperationgSystemDTO dto3= new OperationgSystemDTO("windows", "10V", "Microsoft");
		OperationgSystemDTO dto4= new OperationgSystemDTO("windows", "10V", "Microsoft");
		OperationgSystemDTO dto5= new OperationgSystemDTO("windows", "10V", "Microsoft");
		dao.saveDTO(dto1);
		dao.saveDTO(dto2);
		dao.saveDTO(dto3);
		dao.saveDTO(dto4);
		dao.saveDTO(dto5);
		dao.readDTO();
	}

}
