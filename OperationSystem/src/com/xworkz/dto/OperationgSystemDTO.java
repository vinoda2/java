package com.xworkz.dto;

public class OperationgSystemDTO {
	
	private String osName;
	private String osVersion;
	private String company;
	
	public OperationgSystemDTO(String osName, String osVersion, String company) {
		this.osName = osName;
		this.osVersion = osVersion;
		this.company = company;
	}
	
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((osName == null) ? 0 : osName.hashCode());
		result = prime * result + ((osVersion == null) ? 0 : osVersion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof OperationgSystemDTO))
			return false;
		OperationgSystemDTO other = (OperationgSystemDTO) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (osName == null) {
			if (other.osName != null)
				return false;
		} else if (!osName.equals(other.osName))
			return false;
		if (osVersion == null) {
			if (other.osVersion != null)
				return false;
		} else if (!osVersion.equals(other.osVersion))
			return false;
		return true;
	}
}
