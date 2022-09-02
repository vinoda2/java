package com.xworkz.ecommerce;

import com.xworkz.ecommerce.dao.EcommerceDAO;
import com.xworkz.ecommerce.dao.EcommerceDAOImplements;
import com.xworkz.ecommerce.dto.EcommerceDTO;
import com.xworkz.ecommerce.dto.ProductDTO;
import com.xworkz.ecommerce.service.EcommerceService;
import com.xworkz.ecommerce.service.EcommerceServiceImp;

public class EcommerceRunner {

	public static void main(String[] args) {
		ProductDTO productDTO = new ProductDTO("", "sd24", true);
		EcommerceDTO dto = new EcommerceDTO("","av", 5465541, 464, 0, "bangalore", "cloth", productDTO);
	
		EcommerceDAO dao = new EcommerceDAOImplements();
		EcommerceService valid  = new EcommerceServiceImp(dto);
		valid.validateData(dto);
	}
}
