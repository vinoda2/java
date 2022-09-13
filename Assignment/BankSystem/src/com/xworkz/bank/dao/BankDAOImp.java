package com.xworkz.bank.dao;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.xworkz.bank.dto.BankDTO;

public class BankDAOImp implements BankDAO {
	ArrayList<Object> bdto=new ArrayList();

	@Override
	public boolean saveBankDTO(BankDTO bankDTO) {
		if(bankDTO==null) {
			System.out.println("object is null");
			return false;
		}else {
			bdto.add(bankDTO);
			System.out.println(bdto.size());
			//System.out.println(dto.size());
			System.out.println("object saved");
			return true;
		}
	}

	//@Override
	/*public boolean deleteBankDTO(BankDTO bankDTO) {
		if(bankDTO==null) {
			System.out.println("object is null");
			return false;
		}else {
			bdto.remove(bankDTO);
			bdto.size();
		}
		return false;
	}*/
		
	@Override
	public boolean updateDTO(BankDTO bankDTO, BankDTO bankDTO1) {
		return false;
	}
		
	@Override
	public boolean readBankDTO() {
		return false;
	}

	@Override
	public boolean deleteBankDTO(BankDTO bankDTO) {
		// TODO Auto-generated method stub
		return false;
	}

}
