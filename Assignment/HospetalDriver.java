package com.xworkz.Assignment;

public class HospetalDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospetalDto dto = new HospetalDto();
		dto.setBeds(10);
		dto.setNumberofP(5);
		dto.setNumberOfStaff(15);
		dto.setNumberofDepartement(5);
		
		//System.out.println(dto.getBeds());
		
		HospitalImplementation dtos = new HospitalImplementation();
		dtos.saveDTO(dto);
		//ystem.out.println(dto.toString());

		HospetalDto dto1 = new HospetalDto();
		dto1.setBeds(20);
		dto1.setNumberofP(10);
		dto1.setNumberOfStaff(20);
		dto1.setNumberofDepartement(15);
		dtos.saveDTO(dto1);
		//System.out.println(dto1.toString());
		
		HospetalDto dto2 = new HospetalDto();
		dto2.setBeds(10);
		dto2.setNumberofP(5);
		dto2.setNumberOfStaff(15);
		dto2.setNumberofDepartement(5);
		dtos.saveDTO(dto2);
		//System.out.println(dto2.toString());
		dtos.readDTO();
		dtos.updateDTO(dto, dto1);
		//dtos.deleteDTO(dto2);
		
		dtos.readDTO();
		
		
	


	}

}
