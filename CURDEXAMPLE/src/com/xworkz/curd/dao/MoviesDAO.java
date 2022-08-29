package com.xworkz.curd.dao;

import com.xworkz.curd.dto.MoviesDTO;

public abstract class MoviesDAO {
	//Normal or concrete methods 
	public String getReview() {
		String str="good movie u can watch";
		return str;
	}
	
	public  byte getRating() {
		byte b=4;
		return b;
	}
	
	//abstract methods
	public abstract boolean saveDTO(MoviesDTO dto);
	public abstract boolean updateDTO(MoviesDTO dto,MoviesDTO dto2);
	public abstract boolean deleteDTO(MoviesDTO dto);
	public abstract boolean readDTO();
}
