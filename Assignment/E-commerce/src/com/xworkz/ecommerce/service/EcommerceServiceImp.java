package com.xworkz.ecommerce.service;

import com.xworkz.ecommerce.dao.EcommerceDAO;
import com.xworkz.ecommerce.dto.EcommerceDTO;

public class EcommerceServiceImp implements EcommerceService{
	
	private EcommerceDAO dao;
	public EcommerceServiceImp(EcommerceDTO dto) {
		this.dao=dao;
	}
	@Override
	public boolean validateData(EcommerceDTO ecommerceDTO) {
		int count=checkLen(EcommerceDTO.getCustomerBase());
		if(count==0) {
			System.out.println("u don't have a customer base");
		}else if(count<=10) {
			System.out.println("you have low customer base  ");
		}else {
			System.out.println("happy!! your eligiable for business");
		}

		
		int count1=checkLen(ecommerceDTO.getRegisterNumber());
		if(count1==0) {
			System.out.println("invalid register number");
		}else if(count<=10) {
			System.out.println("valid registered number");
		}else {
			System.out.println("wrong registered number you enter ");
		}
		
		if(ecommerceDTO.getShopName().isBlank()||ecommerceDTO.getShopName().isEmpty()) {
			System.out.println("invalid name");
		}else {
			System.out.println("valid");
		}
		
		if(ecommerceDTO.getProductDTO().getProductName().isBlank()) {
			System.out.println("inavlid name");
		}
		
		return false;
	}
	private int checkLen(long i) {
		long num=i;
		int count=0;
		//System.out.println(num);
		while(num!=0) {
		 	num=num%10;
		 	num=num/10;
		 	count++;	
		}
		//System.out.println(count);
		return count;
		
	}

}
