package com.xworkz.service;

import java.io.Serializable;

import com.xworkz.atmcard.dto.AtmDTO;

public class AtmServiceImplementation implements AtmService,Serializable{

	@Override
	public boolean validateData(AtmDTO atmdto) {
		if(atmdto.getCvv()<3||atmdto.getCardNumber()<16||atmdto.getPin()<4) {
			System.out.println("enter the correct data");
		}else if(atmdto.getCardNumber()==0||atmdto.getCvv()==0||atmdto.getDate()==null||atmdto.getPin()==0) {
			System.out.println("enter the valid data");
		}else {
			System.out.println("object saved!");
		}
		return false;
	}
}
