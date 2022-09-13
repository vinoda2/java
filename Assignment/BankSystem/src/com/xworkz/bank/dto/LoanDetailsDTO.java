package com.xworkz.bank.dto;

public class LoanDetailsDTO {
	
	private String loanID;
	private double loanAmount;
	private boolean loadcleard;
	
	public LoanDetailsDTO(String loanID, double loanAmount, boolean loadcleard) {
		super();
		this.loanID = loanID;
		this.loanAmount = loanAmount;
		this.loadcleard = loadcleard;
	}

	public String getLoanID() {
		return loanID;
	}

	public void setLoanID(String loanID) {
		this.loanID = loanID;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public boolean isLoadcleard() {
		return loadcleard;
	}

	public void setLoadcleard(boolean loadcleard) {
		this.loadcleard = loadcleard;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (loadcleard ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(loanAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((loanID == null) ? 0 : loanID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LoanDetailsDTO))
			return false;
		LoanDetailsDTO other = (LoanDetailsDTO) obj;
		if (loadcleard != other.loadcleard)
			return false;
		if (Double.doubleToLongBits(loanAmount) != Double.doubleToLongBits(other.loanAmount))
			return false;
		if (loanID == null) {
			if (other.loanID != null)
				return false;
		} else if (!loanID.equals(other.loanID))
			return false;
		return true;
	}
}
