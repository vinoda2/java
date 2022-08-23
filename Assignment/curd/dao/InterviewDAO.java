package com.xworkz.curd.dao;

import com.xworkz.curd.dto.InterviewDTO;

public abstract class InterviewDAO {

	public InterviewDTO[] idto = new InterviewDTO[5];

	//creating getter and setter methods
	public InterviewDTO[] getIdto() {
		return idto;
	}
	public void setIdto(InterviewDTO[] idto) {
		this.idto = idto;
	}
	public abstract boolean saveDTO(InterviewDTO dto);
	public abstract boolean findDuplicate(InterviewDTO dto);
	public abstract boolean updateDTO(InterviewDTO dto,InterviewDTO dto1);
	public abstract boolean deleteDTO(InterviewDTO dto);
	public abstract boolean readDTO();
}
