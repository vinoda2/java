package com.xworkz.curd.dao;

import com.xworkz.curd.dto.PenDTO;

public abstract class PenDAO {

	public PenDTO[] pendto=new PenDTO[5];//array size
	
	public abstract boolean saveDTO(PenDTO dto);
	public abstract boolean deleteDTO(PenDTO dto);
	public abstract boolean updateDTO(PenDTO dto,PenDTO dto1);
	public abstract boolean readDTO();
	
}
