package com.xworkz.curd.driver;

import com.xworkz.curd.InterviewImplementation;
import com.xworkz.curd.dao.InterviewDAO;
import com.xworkz.curd.dto.InterviewDTO;

public class InterviewDriver extends InterviewImplementation {

	public static void main(String[] args) {
		InterviewDTO dto = new InterviewDTO();
		InterviewImplementation dao = new InterviewImplementation();
		dto.setCandidateID(2);
		dto.setLocation("mysore");
		dto.setInterviewerID(2);
		dto.setInterviewerName("Ammul");
		dto.setCandidateName("navdeep");
		dto.setInterviewDate("12-09-2022");
		dao.saveDTO(dto);
		
		InterviewDTO dto1 = new InterviewDTO();
		dto1.setCandidateID(3);
		dto1.setLocation("mysore");
		dto1.setInterviewerID(3);
		dto1.setInterviewerName("Tom");
		dto1.setCandidateName("Guru");
		dto1.setInterviewDate("12-09-2022");
		dao.saveDTO(dto1);
		
		InterviewDTO dto2 = new InterviewDTO();
		dto2.setCandidateID(3);
		dto2.setLocation("mysore");
		dto2.setInterviewerID(3);
		dto2.setInterviewerName("Tom");
		dto2.setCandidateName("Guru");
		dto2.setInterviewDate("12-09-2022");
		dao.saveDTO(dto2);
		
		InterviewDTO dto3 = new InterviewDTO();
		dto3.setCandidateID(3);
		dto3.setLocation("mysore");
		dto3.setInterviewerID(3);
		dto3.setInterviewerName("Tom");
		dto3.setCandidateName("Guru");
		dto3.setInterviewDate("12-09-2022");
		dao.saveDTO(dto3);
		
		dao.findDuplicate(dto2);
		dao.updateDTO(dto, dto1);
		//dao.findDuplicate(dto1);
		dao.deleteDTO(dto2);
		dao.readDTO();
	}

}
