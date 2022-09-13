package com.xworkz.bank.dto;

public class BankDTO {
	
	private String bankHeadOffice;
	private String location;
	private long customerBase;
	private long numberOfEmployees;
	private double totalLoan;
	
	public BankDTO(String bankHeadOffice, String location, long customerBase, long numberOfEmployees,
			double totalLoan) {
		super();
		this.bankHeadOffice = bankHeadOffice;
		this.location = location;
		this.customerBase = customerBase;
		this.numberOfEmployees = numberOfEmployees;
		this.totalLoan = totalLoan;
	}

	public String getBankHeadOffice() {
		return bankHeadOffice;
	}

	public void setBankHeadOffice(String bankHeadOffice) {
		this.bankHeadOffice = bankHeadOffice;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getCustomerBase() {
		return customerBase;
	}

	public void setCustomerBase(long customerBase) {
		this.customerBase = customerBase;
	}

	public long getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(long numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getTotalLoan() {
		return totalLoan;
	}

	public void setTotalLoan(double totalLoan) {
		this.totalLoan = totalLoan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankHeadOffice == null) ? 0 : bankHeadOffice.hashCode());
		result = prime * result + (int) (customerBase ^ (customerBase >>> 32));
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (int) (numberOfEmployees ^ (numberOfEmployees >>> 32));
		long temp;
		temp = Double.doubleToLongBits(totalLoan);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BankDTO))
			return false;
		BankDTO other = (BankDTO) obj;
		if (bankHeadOffice == null) {
			if (other.bankHeadOffice != null)
				return false;
		} else if (!bankHeadOffice.equals(other.bankHeadOffice))
			return false;
		if (customerBase != other.customerBase)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (numberOfEmployees != other.numberOfEmployees)
			return false;
		if (Double.doubleToLongBits(totalLoan) != Double.doubleToLongBits(other.totalLoan))
			return false;
		return true;
	}
}
