package com.xworkz.curd.dao;

import com.xworkz.curd.dto.PenDTO;

public class PenImplementation extends PenDAO {
	int index=0;
	
	public boolean saveDTO(PenDTO dto){
		if(pendto.equals(null)||dto.equals(null)) {
			System.out.println("object is null");
			return false;
		}else if(this.index<pendto.length) {
			System.out.println("you can store object");
			pendto[index]=dto;
			this.index++;
			System.out.println("object stored");
			return true;
		}
		
		return false;
	
	}

	@Override
	public boolean deleteDTO(PenDTO dto) {
		if(pendto.equals(null)) {
			System.out.println("object array is nulll");
			return false;
		}else {
			 for(this.index=0;this.index<pendto.length;this.index++) {
				 if(pendto[this.index].equals(dto)) {
					 pendto[this.index]=null;
					 System.out.println("object deleted");
					 return true;
				}

				
			}
		}
		return false;
	}

	@Override
	public boolean updateDTO(PenDTO dto,PenDTO dto1) {
		if(pendto.equals(null)) {
			System.out.println("object array is nulll");
			return false;
		}else {
			 for(this.index=0;this.index<pendto.length;this.index++) {
				 if(pendto[this.index]==dto) {
					 pendto[this.index]=dto1;
					 System.out.println("object updated");
					 return true;
				}

				
			}
		}
		return false;
	}

	@Override
	public boolean readDTO() {
		if(pendto.equals(null)) {
			System.out.println("object array is nulll");
			return false;
		}else {
			for(this.index=0;this.index<pendto.length;this.index++) {
				System.out.println("object is:"+this.index+" :"+pendto[this.index]);
			}
		}
		return false;
	}

}
