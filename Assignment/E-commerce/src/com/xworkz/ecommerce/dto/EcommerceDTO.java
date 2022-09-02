package com.xworkz.ecommerce.dto;
import java.io.Serializable;

public class EcommerceDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8754455784156676436L;
	private String shopName;
	private String ownerName;
	private int id;
	private long registerNumber;
	private static long customerBase;
	private String location;
	private String productType;
	private ProductDTO productDTO;
	
	public EcommerceDTO(String shopName, String ownerName, int id, long registerNumber, long customerBase,
			String location, String productType, ProductDTO productDTO) {
		super();
		this.shopName = shopName;
		this.ownerName = ownerName;
		this.id = id;
		this.registerNumber = registerNumber;
		this.customerBase = customerBase;
		this.location = location;
		this.productType = productType;
		this.productDTO = productDTO;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(long registerNumber) {
		this.registerNumber = registerNumber;
	}
	public static long getCustomerBase() {
		return customerBase;
	}
	public void setCustomerBase(long customerBase) {
		this.customerBase = customerBase;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	
	
}
