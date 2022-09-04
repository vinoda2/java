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
		if(edto==null) {
				System.out.println("object array is null");
		}
		else{
			for(this.index=0;this.index<edto.length;this.index++) {
				if(edto[this.index].equals(ecommerceDTO)) {
					edto[this.index]=null;
					System.out.println("object deleted");
					return true;
				}
			}
		}
		return false;
	}

	@Override

	public boolean updateDTO(EcommerceDTO ecommerceDTO,EcommerceDTO ecommerceDTO1) {
		if(edto.equals(null)) {
			System.out.println("object array is nulll");
			return false;
		}else {
			 for(this.index=0;this.index<edto.length;this.index++) {
				 if(edto[this.index]==ecommerceDTO) {
					 edto[this.index]=ecommerceDTO1;
					 System.out.println("object updated");
					 return true;
				}

				
			}
		}
		return false;
	}

	@Override
	public boolean readDTO() {
		if(edto.equals(null)) {
			System.out.println("object array is null");
	}
	else{
		for(this.index=0;this.index<edto.length;this.index++) {
			System.out.println(edto[this.index]);
		}
	}
	return false;
	
	}
}

