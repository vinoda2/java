package com.xworkz.dao;

import com.xworkz.dto.OperationgSystemDTO;

public interface OperationgSystem {
	abstract boolean saveDTO(OperationgSystemDTO osDTO);
	abstract boolean readDTO();

}
