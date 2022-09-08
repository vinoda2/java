package com.xworkz.lake;

import com.xworkz.lake.exception.InvalidData;
import com.xworkz.lake.lakeservice.ServiceLake;
import com.xworkz.lake.lakeservice.ServiceLakeImp;
import com.xworkz.lakedao.LakeInterface;
import com.xworkz.lakedao.LakeInterfaceImp;
import com.xworkz.lakedto.GangaLakeDTO;
import com.xworkz.lakedto.LakeDTO;

public class LakeRunner {

	public static void main(String[] args) throws InvalidData {
		GangaLakeDTO gdto = new GangaLakeDTO();
		LakeDTO dto = new LakeDTO("netra", 2, "BTM", gdto);
		
		ServiceLake service = new ServiceLakeImp();
		
		service.validateData(dto);
		/*LakeInterface dao = new LakeInterfaceImp();
		dao.save(dto);
		LakeDTO dto1 = new LakeDTO("netra", 0, "BTM", gdto);
		LakeDTO dto2 = new LakeDTO("", 0, "BTM", gdto);
		LakeDTO dto3 = new LakeDTO("netra", 0, "BTM", gdto);
		dao.save(dto1);
		dao.save(dto2);
		dao.main();
		*/

	}

}
