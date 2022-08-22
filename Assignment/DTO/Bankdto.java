package com.xworkz.Assignment.DTO;

public class Bankdto {
	
	private String accountHolderName;
	private long accountNumber;
	private String accountType;
	private String panNumber;
	private int aAdharNumber;
	private String branchCode;
	private String ifscCode;
	private String microCode;
	private double balance;
	private double withdraw=0;
	
	/*private Bankdto(String accountHolderName, long accountNumber, String accountType, String panNumber,
			int aAdharNumber, String branchCode, String ifscCode, String microCode, double balance, double withdraw) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.panNumber = panNumber;
		this.aAdharNumber = aAdharNumber;
		this.branchCode = branchCode;
		this.ifscCode = ifscCode;
		this.microCode = microCode;
		this.balance = balance;
		this.withdraw = withdraw;
	}
*/
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public int getaAdharNumber() {
		return aAdharNumber;
	}

	public void setaAdharNumber(int aAdharNumber) {
		this.aAdharNumber = aAdharNumber;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getMicroCode() {
		return microCode;
	}

	public void setMicroCode(String microCode) {
		this.microCode = microCode;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	@Override
	public String toString() {
		return "Bankdto [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", accountType="
				+ accountType + ", panNumber=" + panNumber + ", aAdharNumber=" + aAdharNumber + ", branchCode="
				+ branchCode + ", ifscCode=" + ifscCode + ", microCode=" + microCode + ", balance=" + balance
				+ ", withdraw=" + withdraw + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Bankdto))
			return false;
		Bankdto other = (Bankdto) obj;
		if (aAdharNumber != other.aAdharNumber)
			return false;
		if (accountHolderName == null) {
			if (other.accountHolderName != null)
				return false;
		} else if (!accountHolderName.equals(other.accountHolderName))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (branchCode == null) {
			if (other.branchCode != null)
				return false;
		} else if (!branchCode.equals(other.branchCode))
			return false;
		if (ifscCode == null) {
			if (other.ifscCode != null)
				return false;
		} else if (!ifscCode.equals(other.ifscCode))
			return false;
		if (microCode == null) {
			if (other.microCode != null)
				return false;
		} else if (!microCode.equals(other.microCode))
			return false;
		if (panNumber == null) {
			if (other.panNumber != null)
				return false;
		} else if (!panNumber.equals(other.panNumber))
			return false;
		if (Double.doubleToLongBits(withdraw) != Double.doubleToLongBits(other.withdraw))
			return false;
		return true;
	}
	
	
	
	
}
