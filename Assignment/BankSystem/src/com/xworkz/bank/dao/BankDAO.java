package com.xworkz.bank.dao;

import com.xworkz.bank.dto.BankDTO;

public interface BankDAO {

	abstract boolean saveBankDTO(BankDTO bankDTO);
	abstract boolean deleteBankDTO(BankDTO bankDTO);
	abstract boolean updateDTO(BankDTO bankDTO, BankDTO bankDTO1);
	abstract boolean readBankDTO();
}
