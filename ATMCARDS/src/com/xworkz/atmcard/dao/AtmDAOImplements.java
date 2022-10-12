package com.xworkz.atmcard.dao;

import com.xworkz.atmcard.dto.AtmDTO;

public class AtmDAOImplements implements AtmDAO {
	//object array 
	private AtmDTO atm[]=new AtmDTO[5];
	
	int index=0;
	
	//setter and getter
	public AtmDTO[] getAtm() {
		return atm;
	}
	public void setAtm(AtmDTO[] atm) {
		this.atm = atm;
	}
	
	
    public boolean saveAtmDto(AtmDTO atmdto) {
    	if(atm==null||atmdto==null) {
    		System.out.println("object is null");
    	}else {
    		for(index=0;index<this.atm.length;index++) {
    			this.atm[index]=atmdto;
    			this.index++;
    			System.out.println("object saved");
    			return true;
    		}
    	}
    	return false;
		
	}
	public boolean deleteAtmDto(AtmDTO atmdto) {
		if(atm==null||atmdto==null) {
			System.out.println("object is null");
		}else {
			for(index=0;index<this.atm.length;index++) {
				if(this.getAtm()[index].equals(atmdto)) {
					this.getAtm()[index]=null;
					System.out.println("object deleted");
					return true;
				}
			}
		}
		return false;
		
	}
	
	public boolean readAtmdto() {
		if(atm==null) {
			System.out.println("object is null");
		}else {
			for(index=0;index<this.getAtm().length;index++) {
				System.out.println(this.getAtm()[index]);
				return true;
			}
		}
		return false;
		
	}
	@Override
	public boolean updateAtmDto(AtmDTO atmdto) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
