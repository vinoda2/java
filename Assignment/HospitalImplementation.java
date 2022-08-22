package com.xworkz.Assignment;

public class HospitalImplementation extends HospetalDAO {

	@Override
	public boolean saveDTO(HospetalDto dto) {
		if(dto==null) {
			System.out.println("we can't save");
			return false;
		}else if(this.index<=hdtos.length) {
				hdtos[index]=dto;
				this.index++;
				System.out.println("object saved:"+this.index);
				return true;
			}else {
				System.out.println("object array is full we can't hold your object");
			}
			//System.out.println("you  can save");
		
		return false;
	}

	@Override
	public boolean deleteDTO(HospetalDto dto) {
		if(dto==null) {
			System.out.println("we can't delete");
			return false;
		}
			for(this.index=0;this.index<hdtos.length;this.index++){
			if(hdtos[index]==dto) {
				hdtos[index]=null;
				System.out.println("object deleted");
				return true;
			}
		}
		return false;
	}

}
