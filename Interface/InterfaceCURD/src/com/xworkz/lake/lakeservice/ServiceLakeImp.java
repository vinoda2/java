package com.xworkz.lake.lakeservice;

import com.xworkz.lake.exception.InvalidData;
import com.xworkz.lakedto.LakeDTO;

public class ServiceLakeImp implements ServiceLake {

	@Override
	public boolean validateData(LakeDTO lakeDTO) throws InvalidData {
		if(lakeDTO.getSize()==0||lakeDTO.getLocation()==null||lakeDTO.getName().equals(null))
		{
			throw new InvalidData("invalid object data");
		}else if(lakeDTO.getName().length()<3) {
			throw new InvalidData("invalid data");
		}else {
			throw new InvalidData("valid data");
		}
	}
	

}
