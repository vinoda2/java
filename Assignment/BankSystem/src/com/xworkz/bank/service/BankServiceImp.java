package com.xworkz.bank.service;

import com.xworkz.bank.dao.BankDAO;
import com.xworkz.bank.dto.BankDTO;
import com.xworkz.bank.exception.InvalidDataException;

public class BankServiceImp implements BankService{

	public BankServiceImp(BankDAO bankDAO) {
		super();
		this.bankDAO = bankDAO;
	}

	private BankDAO bankDAO;

	@Override
	public boolean dataCheck(BankDTO bankDTO) {
		if(bankDTO.getBankHeadOffice()==null) {
			System.out.println("null values");
		}
		if(bankDTO.getCustomerBase()==0) {
			//throw new InvalidDataException("No customer base");
			System.out.println("no customer");
		}if(bankDTO.getLocation().equals(null))
		{
			System.out.println("invalid data");
		}else {
		
			System.out.println("object saved");
		}
		return false;
	}
	
	

	
}
