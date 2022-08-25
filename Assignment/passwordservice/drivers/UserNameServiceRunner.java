package com.xworkz.drivers;

import com.xworkz.passwordservice.UserNameService;

public class UserNameServiceRunner {

	public static void main(String[] args) {
		UserNameService user = new UserNameService();
		user.checkUserName(null);
	}

}
