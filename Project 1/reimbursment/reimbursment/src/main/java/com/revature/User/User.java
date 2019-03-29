package com.revature.User;

public class User {

	
	private int ers_users_id;
	private String ers_user_name;
	private String user_first_name;
	private String user_last_name;
	private String user_email;
	private int user_role_id;
	
	public User(int ers_users_id, String ers_user_name, String user_first_name, String user_last_name,
			String user_email, int user_role_id) {
		this.ers_users_id = ers_users_id;
		this.ers_user_name = ers_user_name;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
		
		
		
	}
//for when we don't need the user id
	public User(String ers_user_name, String user_first_name, String user_last_name, String user_email,
			int user_role_id) {
		this.ers_user_name = ers_user_name;
		this.user_first_name = user_first_name;
		this.user_last_name = user_last_name;
		this.user_email = user_email;
		this.user_role_id = user_role_id;
	}
	public User(int ers_users_id2, String ers_user_name2, String ers_user_name3, String user_first_name2,
			String user_last_name2, String user_email2, int user_role_id2) {
		// TODO Auto-generated constructor stub
	}
	public int getErs_users_id() {
		return ers_users_id;
	}
	public void setErs_users_id(int ers_users_id) {
		this.ers_users_id = ers_users_id;
	}
	public String getErs_user_name() {
		return ers_user_name;
	}
	public void setErs_user_name(String ers_user_name) {
		this.ers_user_name = ers_user_name;
	}
	public String getUser_first_name() {
		return user_first_name;
	}
	public void setUser_first_name(String user_first_name) {
		this.user_first_name = user_first_name;
	}
	public String getUser_last_name() {
		return user_last_name;
	}
	public void setUser_last_name(String user_last_name) {
		this.user_last_name = user_last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_role_id() {
		return user_role_id;
	}
	public void setUser_role_id(int user_role_id) {
		this.user_role_id = user_role_id;
	}
	
	
	@Override
	public String toString() {
		return "User [ers_users_id=" + ers_users_id + ", ers_user_name=" + ers_user_name + ", user_first_name="
				+ user_first_name + ", user_last_name=" + user_last_name + ", user_email=" + user_email
				+ ", user_role_id=" + user_role_id + "]";
	}
	
	
	



}
