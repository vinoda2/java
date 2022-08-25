package com.xworkz.passwordservice;

import com.xworkz.passwordservice.exception.InvalidException;

public class PasswordProperty {
	String password;
	
	/*public PasswordProperty() {
		System.out.println("Default constructor");
	}*/
	
	
	public void checkPassword(String password) throws InvalidException {
		try {
			if(password.isEmpty()||password.isBlank()||password.equals(null)||password.length()<8) {
				throw new InvalidException("enter the correct password");
				
			}else {
				System.out.println("password is:"+password);
			}
			
		
		} catch (InvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error handled successfully");
			
		}
		finally {
		
			System.out.println("Successfully completed");
		}
	}

}

