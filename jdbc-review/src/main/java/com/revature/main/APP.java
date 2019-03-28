package com.revature.main;

import com.revature.data.UserDAO;
import com.revature.model.User;
import com.revature.service.UserService;

public class APP {

	
	public static void main (String [] args) {
		//UserDAO dao = new UserDAO();
		//System.out.println().getUsers());
//		System.out.println(dao.getUsers());
		
		UserService service = new UserService();
		//System.out.println(service.logIn("geneisb", "123"));
		
		System.out.println(service.addUser(new User("testuser", "admin", "admin test user")));
		
	}
}
