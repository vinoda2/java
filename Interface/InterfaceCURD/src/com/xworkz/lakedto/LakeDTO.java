package com.xworkz.lakedto;

public class LakeDTO{
	
	private String name;
	private double size;
	private String location;
	private GangaLakeDTO gangaLakeDTO;
	
	public LakeDTO() {
		System.out.println("default constructor");
	}
	
	public LakeDTO(String name, double size, String location, GangaLakeDTO gangaLakeDTO) {
		this.name = name;
		this.size = size;
		this.location = location;
		this.gangaLakeDTO=gangaLakeDTO;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof LakeDTO))
			return false;
		LakeDTO other = (LakeDTO) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}

	public GangaLakeDTO getGangaLakeDTO() {
		return gangaLakeDTO;
	}

	public void setGangaLakeDTO(GangaLakeDTO gangaLakeDTO) {
		this.gangaLakeDTO = gangaLakeDTO;
	}
}
