package com.xworkz.curd.dto;

public class InterviewDTO {
	
	String interviewDate;
	String interviewerName;
	int interviewerID;
	String candidateName;
	int candidateID;
	String location;
	
	private InterviewDTO(String interviewDate, String interviewerName, int interviewerID, String candidateName,
			int candidateID, String location) {
		super();
		this.interviewDate = interviewDate;
		this.interviewerName = interviewerName;
		this.interviewerID = interviewerID;
		this.candidateName = candidateName;
		this.candidateID = candidateID;
		this.location = location;
	}

	public InterviewDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("defualt constructor");
	}

	public String getInterviewDate() {
		return interviewDate;
	}

	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}

	public String getInterviewerName() {
		return interviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		this.interviewerName = interviewerName;
	}

	public int getInterviewerID() {
		return interviewerID;
	}

	public void setInterviewerID(int interviewerID) {
		this.interviewerID = interviewerID;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public int getCandidateID() {
		return candidateID;
	}

	public void setCandidateID(int candidateID) {
		this.candidateID = candidateID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "InterviewDTO [interviewDate=" + interviewDate + ", interviewerName=" + interviewerName
				+ ", interviewerID=" + interviewerID + ", candidateName=" + candidateName + ", candidateID="
				+ candidateID + ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + candidateID;
		result = prime * result + ((candidateName == null) ? 0 : candidateName.hashCode());
		result = prime * result + ((interviewDate == null) ? 0 : interviewDate.hashCode());
		result = prime * result + interviewerID;
		result = prime * result + ((interviewerName == null) ? 0 : interviewerName.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof InterviewDTO))
			return false;
		InterviewDTO other = (InterviewDTO) obj;
		if (candidateID != other.candidateID)
			return false;
		if (candidateName == null) {
			if (other.candidateName != null)
				return false;
		} else if (!candidateName.equals(other.candidateName))
			return false;
		if (interviewDate == null) {
			if (other.interviewDate != null)
				return false;
		} else if (!interviewDate.equals(other.interviewDate))
			return false;
		if (interviewerID != other.interviewerID)
			return false;
		if (interviewerName == null) {
			if (other.interviewerName != null)
				return false;
		} else if (!interviewerName.equals(other.interviewerName))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		return true;
	}
	
	
	
	
}
