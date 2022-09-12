package com.xworkz.dao;
import java.util.*;

import com.xworkz.dto.OperationgSystemDTO;

public class OperationgSystemImp implements OperationgSystem {
	ArrayList systemDTO=new ArrayList();
	

	@Override
	public boolean saveDTO(OperationgSystemDTO osDTO) {
		if(osDTO==null) {
			System.out.println("object is null");
			return false;
		}else {
			systemDTO.add(osDTO);
			System.out.println("object saved succussfully");
		}
		return false;
	}

	@Override
	public boolean readDTO() {
		if(systemDTO==null) {
			System.out.println("object is null");
			return false;
		}else {
			systemDTO.containsAll(systemDTO);
			//System.out.println("object is present inside the ArrayList");
			System.out.println(systemDTO.size());
			//systemDTO.forEach(null);
			
		}
		return false;
	}
	

}
