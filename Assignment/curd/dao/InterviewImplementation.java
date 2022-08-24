package com.xworkz.curd.dao;

//import com.xworkz.curd.dao.InterviewDAO;
import com.xworkz.curd.dto.InterviewDTO;

public class InterviewImplementation extends InterviewDAO {
	int index=0;
	
	public boolean saveDTO(InterviewDTO dto) {
		if(dto.equals(null)) {
			System.out.println("object list is empty");
			return false;
		}else if(this.index<this.getIdto().length){
			//findDuplicate(dto);
			this.getIdto()[index]=dto;
			System.out.println("object saved:"+this.index);
			this.index++;
			return true;
		}
		return false;
		 
	 }
	 public boolean findDuplicate(InterviewDTO dto) {
		 if(dto.equals(null)) {
				System.out.println("object list is empty");
				return false;
		 }else {
		 for(int i=0;i<this.getIdto().length;i++)
		 {
			 if(this.getIdto()[i]!=null &&this.getIdto()[i].equals(dto)) {
				 System.out.println("object already exist");
				 return true;
			 	}
		 	}
		 }
		return false;
	}
	 public boolean updateDTO(InterviewDTO dto,InterviewDTO dto1) {
		 if(dto.equals(null) && dto1.equals(null)) {
				System.out.println("DTO is null we can't update");
				return false;
			}else {
				for(this.index=0;this.index<this.getIdto().length;index++) {
					if(this.getIdto()[index].getInterviewerID()==dto.getCandidateID()) {
						this.getIdto()[index]=dto1;
						System.out.println("object updated");
						return true;
					}
				}
			}
		return false;
		 
	 }
	 public boolean deleteDTO(InterviewDTO dto) {
		 if(dto.equals(null)) {
				System.out.println("object list is empty");
				return false;
		 }else {
			 for(this.index=0;this.index<this.getIdto().length;this.index++) {
				 if(this.getIdto()[index].equals(dto))
				 {
					 this.getIdto()[index]=null;
					 System.out.println("object deleted");
					 return true;
				 }
			 }
			 
		 }
		return false;
	
	 }
	@Override
	public boolean readDTO() {
		if(this.getIdto()!=null) {
			for(this.index=0;this.index<this.getIdto().length;this.index++) {
				System.out.println("array object is:"+this.getIdto()[index]);
				return true;
			}
		}else {
			System.out.println("object array is null");
		}
		
		return false;
	}
	
}

