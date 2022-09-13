package com.xworkz.bank.dto;

public class CustomerDetailsDTO {
	
	private String custID;
	private String customerName;
	private long accountNumber;
	private String branchID;
	
	public CustomerDetailsDTO(String custID, String customerName, long accountNumber, String branchID) {
		super();
		this.custID = custID;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.branchID = branchID;
	}

	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountNumber ^ (accountNumber >>> 32));
		result = prime * result + ((branchID == null) ? 0 : branchID.hashCode());
		result = prime * result + ((custID == null) ? 0 : custID.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CustomerDetailsDTO))
			return false;
		CustomerDetailsDTO other = (CustomerDetailsDTO) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (branchID == null) {
			if (other.branchID != null)
				return false;
		} else if (!branchID.equals(other.branchID))
			return false;
		if (custID == null) {
			if (other.custID != null)
				return false;
		} else if (!custID.equals(other.custID))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
}
