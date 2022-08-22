package com.xworkz.Abstraction;

public abstract class Bank {
	//variables
		String name;
		int accountNo;
		String ifscCode;
		String microCode;
		String branchName;
		String accountType;
		double balance;
	
	public Bank(String name, int accountNo, String ifscCode, String microCode, String branchName, String accountType,
			double balance) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.microCode = microCode;
		this.branchName = branchName;
		this.accountType = accountType;
		this.balance = balance;
	}
	//abstract method
	public abstract double loanInterest();
	
	//concrete method
	void openAccount(int age) {
		if(age<=10) {
			System.out.println("your eligiable to open ");
		}else {
			System.out.println("you can open SB account ");
		}
	}
	void checkBalance(double b) {
		if(b<1000) {
			System.out.println("insufficient balance");
		}else {
			System.out.println("balance maintained");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNo;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((branchName == null) ? 0 : branchName.hashCode());
		result = prime * result + ((ifscCode == null) ? 0 : ifscCode.hashCode());
		result = prime * result + ((microCode == null) ? 0 : microCode.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (accountNo != other.accountNo)
			return false;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (branchName == null) {
			if (other.branchName != null)
				return false;
		} else if (!branchName.equals(other.branchName))
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the accountNo
	 */
	public int getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/**
	 * @return the microCode
	 */
	public String getMicroCode() {
		return microCode;
	}

	/**
	 * @param microCode the microCode to set
	 */
	public void setMicroCode(String microCode) {
		this.microCode = microCode;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
