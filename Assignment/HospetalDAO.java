package com.xworkz.Assignment;

public abstract class HospetalDAO extends HospetalDto{
	
	public HospetalDto[] hdtos=new HospetalDto[3];
	int index=0;
	
	public abstract boolean saveDTO(HospetalDto dto);
	public abstract boolean deleteDTO(HospetalDto dto);
	
	public boolean updateDTO(HospetalDto dto,HospetalDto dto1) {
		if (dto==null && dto1==null) {
			System.out.println("we can't update");
			return false;
		}else{
			for(this.index=0;this.index<hdtos.length;this.index++) {
				if(hdtos[index]==dto) {
					hdtos[index]=dto1;
					System.out.println("updated values");
					return true;
				}
			}
			 
			System.out.println("we can update");
		}
		return false;
		
	}
	
	public void readDTO() {
		for(this.index=0;this.index<hdtos.length;this.index++) {
			System.out.println(hdtos[index]);
		}
	}
	

}
