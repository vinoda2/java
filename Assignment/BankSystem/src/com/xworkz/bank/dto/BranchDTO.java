package com.xworkz.bank.dto;

public class BranchDTO {
	
	private String branchID;
	private String location;
	private String ifsc;
	private long microcode;
	
	public BranchDTO(String branchID, String location, String ifsc, long microcode) {
		super();
		this.branchID = branchID;
		this.location = location;
		this.ifsc = ifsc;
		this.microcode = microcode;
	}

	public String getBranchID() {
		return branchID;
	}

	public void setBranchID(String branchID) {
		this.branchID = branchID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public long getMicrocode() {
		return microcode;
	}

	public void setMicrocode(long microcode) {
		this.microcode = microcode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((branchID == null) ? 0 : branchID.hashCode());
		result = prime * result + ((ifsc == null) ? 0 : ifsc.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (int) (microcode ^ (microcode >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BranchDTO))
			return false;
		BranchDTO other = (BranchDTO) obj;
		if (branchID == null) {
			if (other.branchID != null)
				return false;
		} else if (!branchID.equals(other.branchID))
			return false;
		if (ifsc == null) {
			if (other.ifsc != null)
				return false;
		} else if (!ifsc.equals(other.ifsc))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (microcode != other.microcode)
			return false;
		return true;
	}
}
