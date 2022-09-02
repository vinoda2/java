package com.xworkz.ecommerce.dto;

public class ProductDTO {
	
	private String productName;
	private String ProductCode;
	private boolean productAvailablility;
	
	public ProductDTO(String productName, String productCode, boolean productAvailablility) {
		this.productName = productName;
		this. ProductCode = productCode;
		this.productAvailablility = productAvailablility;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public boolean isProductAvailablility() {
		return productAvailablility;
	}
	public void setProductAvailablility(boolean productAvailablility) {
		this.productAvailablility = productAvailablility;
	}
	
	
	
}
