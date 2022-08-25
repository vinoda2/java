package com.xworkz.passwordservice;

import com.xworkz.passwordservice.exception.InvalidDataException;
import com.xworkz.passwordservice.exception.InvalidException;

public class UserNameService {
		String userName;
		public UserNameService() {
			System.out.println("default constructor");
		}
		
		public void checkUserName(String userName) {
			try {
				if(userName.equals(null)) {
					throw new InvalidDataException("Enter the correct username");
			
				}else {
					System.out.println("username is:"+userName);
				}
			} catch (InvalidDataException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				
			}finally {
				System.out.println("Successfully completed");
			}
		}
}
