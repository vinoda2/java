package com.xworkz.Assignment.DTO;

public class BankDriver extends BankDaoImplementation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankdto dto = new Bankdto();
		dto.setaAdharNumber(543556875);
		dto.setAccountHolderName("anamika");
		dto.setAccountNumber(254354);
		dto.setAccountType("SB");
		dto.setBalance(80000);
		dto.setBranchCode("bangalore");
		dto.setBranchCode("BKHK15");
		dto.setIfscCode("BK454");
		dto.setMicroCode("ffhg5645");
		dto.setPanNumber("5456hh");
		dto.setWithdraw(1000);
		
		Bankdto dto1 = new Bankdto();
		dto1.setaAdharNumber(5435);
		dto1.setAccountHolderName("akash");
		dto1.setAccountNumber(254354);
		dto1.setAccountType("SB");
		dto1.setBalance(80000);
		dto1.setBranchCode("mysore");
		dto1.setBranchCode("BKHK15");
		dto1.setIfscCode("BK454");
		dto1.setMicroCode("ffhg5645");
		dto1.setPanNumber("5456h");
		dto1.setWithdraw(1000);
		
		Bankdto dto2 = new Bankdto();
		dto2.setaAdharNumber(5435);
		dto2.setAccountHolderName("sakast");
		dto2.setAccountNumber(254354);
		dto2.setAccountType("SB");
		dto2.setBalance(80000);
		dto2.setBranchCode("bangalore");
		dto2.setBranchCode("BKHK15");
		dto2.setIfscCode("BK454");
		dto2.setMicroCode("ffhg5645");
		dto2.setPanNumber("5456hh");
		dto2.setWithdraw(1000);
		
		//polymarphism
		BankDAO dao = new BankDaoImplementation();
		
		//saving objects
		dao.saveDTO(dto);
		dao.saveDTO(dto1);
		dao.saveDTO(dto2);
		
		//deleting objects
		dao.deleteDTO(dto2);
		
		//updating object
		dao.updateDTO(dto1, dto2);
		
		//reading data from an array
		dao.readDTO();
		
		//check balance
		dao.checkBalance(dto.getBalance());
		
		//checking account number
		dao.checkAccountNumber(dto.getAccountNumber());
	}

}
