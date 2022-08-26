package com.xworkz.exception;

public class PasswordService {
	private String password;
	
	public PasswordService() {
		System.out.println("defualt constructor");
	}

	@Override
	public String toString() {
		return "PasswordService [password=" + password + "]";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
