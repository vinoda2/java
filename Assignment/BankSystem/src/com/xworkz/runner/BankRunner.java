package com.xworkz.runner;

import com.xworkz.bank.dao.BankDAO;
import com.xworkz.bank.dao.BankDAOImp;
import com.xworkz.bank.dto.BankDTO;
import com.xworkz.bank.service.BankService;
import com.xworkz.bank.service.BankServiceImp;

public class BankRunner {
	public static void main(String args[]) {
		BankDTO dto = new BankDTO("Bangalore", "Karnataka", 500,0, 4525.15);
		BankDAO dao = new BankDAOImp();
		BankService service = new BankServiceImp(dao);
		service.dataCheck(dto);
		dao.saveBankDTO(dto);
		BankDTO dto2 = new BankDTO("Bangalore", null, 500,0, 4525.15);
		BankDTO dto3 = new BankDTO("Bangalore", "Karnataka", 500,0, 4525.15);
		BankDTO dto4 = new BankDTO("Bangalore", "Karnataka", 500,0, 4525.15);
		BankDTO dto5 = new BankDTO("Bangalore", "Karnataka", 500,0, 4525.15);
		dao.saveBankDTO(dto5);
		dao.saveBankDTO(dto4);
		//service.dataCheck(dto5);
		
		dao.saveBankDTO(dto3);
		dao.saveBankDTO(dto2);
		
	}
}
