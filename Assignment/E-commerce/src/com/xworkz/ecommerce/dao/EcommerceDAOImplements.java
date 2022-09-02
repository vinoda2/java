package com.xworkz.ecommerce.dao;

import com.xworkz.ecommerce.dto.EcommerceDTO;

public class EcommerceDAOImplements implements EcommerceDAO {
	private EcommerceDTO edto[]=new EcommerceDTO[5];
	int index;
	
	public EcommerceDTO[] getEdto() {
		return edto;
	}
	
	@Override
	public boolean saveDTO(EcommerceDTO ecommerceDTO) {
		if(ecommerceDTO==null) {
			System.out.println("object is null");
			return false;
		}else if(this.index<this.edto.length) {
			this.edto[this.index]=ecommerceDTO;
			this.index++;
			System.out.println("object saved:"+this.index);
			return true;
		}else {
			System.out.println("object array is full");
		}
		return false;
	}

	@Override
	public boolean dateleDTO(EcommerceDTO ecommerceDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDTO(EcommerceDTO ecommerceDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean readDTO(EcommerceDTO ecommerceDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
