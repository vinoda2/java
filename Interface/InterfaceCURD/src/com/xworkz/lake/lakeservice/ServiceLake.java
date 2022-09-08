package com.xworkz.lake.lakeservice;

import com.xworkz.lake.exception.InvalidData;
import com.xworkz.lakedto.LakeDTO;

public interface ServiceLake {
	abstract boolean validateData(LakeDTO lakeDTO) throws InvalidData;  
}
