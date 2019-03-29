package com.revature.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.revature.User.User;

public class UserDBUtil {

	
	private DataSource dataSource;
	
	//create constructor
	public UserDBUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}
	
	//list employees
	public List<User> getEmployees() throws Exception{
		
		List<User> employees = new ArrayList<>();
		
		Connection conn= null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			///get the connection
			conn = dataSource.getConnection();
			//create sql statement
			String sql = "Select * from TWReimbursements.ERS_REIMBURSMENT_TYPE order by USER_LAST_NAME";
			
			myStmt = conn.createStatement();
			//execute query
			myRs = myStmt.executeQuery(sql);
			//process result set
			while(myRs.next()) {
				
				//retrieve data from result set row
				int ers_users_id = myRs.getInt("ers_users_id");
				String ers_user_name = myRs.getString("ers_user_name");
				String user_first_name = myRs.getString("user_first_name");
				String user_last_name = myRs.getString("user_last_name");
				String user_email= myRs.getString("user_email");
				int 	user_role_id = myRs.getInt("user_role_id");
				//create new employee object
				
				User tempUser = new User(ers_users_id,ers_user_name,user_first_name,user_last_name,user_email,user_role_id);
				
				//add it to the list of employees
				employees.add(tempUser);
			}
			//close JDBD objects
			close(conn,myStmt, myRs);
			
			return employees;
		}
		//try finally instead of catch
		finally {
			
		}
	}

	private void close(Connection conn, Statement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if (myRs !=null) {
				myRs.close();
			}
			if (myStmt !=null ) {
				myStmt.close();
			}
			if (conn !=null) {
				conn.close();
			}
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
