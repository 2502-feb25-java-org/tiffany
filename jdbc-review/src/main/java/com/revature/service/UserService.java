package com.revature.service;

import com.revature.data.UserDAO;
import com.revature.model.User;

public class UserService {

	
	static UserDAO dao = new UserDAO();
	
	
	
	
	
	
	public User logIn(String username, String password) {
		User u = dao.getByUsername(username);
		if(u == null) {
			return null; //no user by username
		}
		else {
			if(u.getPassword().equals(password)) {
				return u; //success!
			}
			else {
				return null; //password does not match 
			}
		}
	}
	
	public User addUser(User u) {
		
		
		if(dao.getByUsername(u.getUsername())==null){
			return dao.addUser(u);
		}
		else {
			return null;
		}
	}
}

