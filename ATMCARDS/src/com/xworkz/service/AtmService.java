package com.xworkz.service;

import com.xworkz.atmcard.dto.AtmDTO;

public interface AtmService {
       public abstract boolean validateData(AtmDTO atmdto);
}
