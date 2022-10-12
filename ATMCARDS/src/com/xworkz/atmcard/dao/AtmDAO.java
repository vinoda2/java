package com.xworkz.atmcard.dao;

import com.xworkz.atmcard.dto.AtmDTO;

public interface  AtmDAO {
    abstract boolean saveAtmDto(AtmDTO atmdto);
	abstract boolean deleteAtmDto(AtmDTO atmdto);
	abstract boolean updateAtmDto(AtmDTO atmdto);
	abstract boolean readAtmdto();
}
