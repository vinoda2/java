package com.xworkz.Assignment.DTO;

public abstract class BankDAO {
	public Bankdto[] dtos=new Bankdto[3];
	int index=0;

	//creating object of type array
	public boolean saveDTO(Bankdto dto) {
		if(dto==null) {
			System.out.println("DTO is null can't save");
			return false;
		}else if (this.index<dtos.length) {
			this.dtos[index]=dto;
			this.index++;
			System.out.println("saved dto:"+this.index);
			return true;
		}else {
			System.out.println("DTO array is full can't save");
			return false;
		}
		
	}
	
	//deleting the object from on array
	public boolean deleteDTO(Bankdto dto) {
		if(dto==null) {
			System.out.println("DTO is null we can't delete");
			return false;
		}
		for(this.index=0;this.index<this.dtos.length;index++) {
			if(this.dtos[index]==dto) {
				this.dtos[index]=null;
				System.out.println("object deleted in dto");
				return true;
			}
		}
		return false;
		
	}
	//updating the object in an array
	public boolean updateDTO(Bankdto dto,Bankdto dto1) {
		if(dto==null) {
			System.out.println("DTO is null we can't update");
			return false;
		}for(this.index=0;this.index<this.dtos.length;index++) {
			if(this.dtos[index]==dto) {
				this.dtos[index]=dto1;
				System.out.println("object updated");
				return true;
			}
		}
		return false;
	}


	protected abstract void readDTO(); 
	protected abstract void checkBalance(double balance);
	public abstract void getBalance(double balance,double withdraw);
	public abstract void checkAccountNumber(long accountNumber); 
}
