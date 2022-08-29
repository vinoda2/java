package com.xworkz.curd.dao;

import com.xworkz.curd.dto.MoviesDTO;

public class MoviesDaoImp extends MoviesDAO {
	public MoviesDTO[] mdto = new MoviesDTO[5];
	int index=0;
	
	@Override
	public boolean saveDTO(MoviesDTO dto) {
		if(dto.equals(null)) {
			if(mdto.equals(null)) {
				System.out.println("you can save objects");
				return false;
			}
		}else {
			if(this.index<mdto.length) {
				mdto[this.index]=dto;
				this.index++;
				System.out.println("object saved:"+this.index);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean updateDTO(MoviesDTO dto,MoviesDTO dto2) {
		if(dto.equals(null)) {
			if(mdto.equals(null)) {
				System.out.println("object and object array is null");
				return false;
			}
		}else {
			for(this.index=0;this.index<mdto.length;this.index++)
			if(mdto[this.index]==dto) {
				mdto[this.index]=dto2;
			
				System.out.println("updated:"+this.index);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteDTO(MoviesDTO dto) {
	
		if(dto.equals(null)) {
			if(mdto.equals(null)) {
				System.out.println("object and object array is null");
				return false;
			}
		}else {
			for(this.index=0;this.index<mdto.length;this.index++)
			if(mdto[this.index]==dto) {
				mdto[this.index]=null;
				System.out.println("object deleted");
				return true;
			}
		}
		
		return false;
	}


	@Override
	public boolean readDTO() {
			if(mdto.equals(null)) {
				System.out.println("you can save objects");
				return false;
			}
		else {
			for(this.index=0;this.index<mdto.length;this.index++) {
				System.out.println(":"+mdto[this.index]);
			}
			
		return false;
	}
	}
}