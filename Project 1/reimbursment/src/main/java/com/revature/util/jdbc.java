package com.revature.util;

import java.sql.*;
public class jdbc {

	
	public static void main (String [] args) {
		
		
		try {
		// 1. get a connection to database
			Connection conn = DriverManager.getConnection("jdbc:mysql://twmysql.cbcizsywp3kr.us-east-1.rds.amazonaws.com:3306/TWReimbursements", "TiffyW","1Babygirl");
			
			
			
			
			
			//2. create a statement
			Statement myStatement = conn.createStatement();
			
			//3. execute sql query
			ResultSet myRs = myStatement.executeQuery("select * from TWReimbursements.ERS_USERS;");
			//4. process the result set
			while (myRs.next()) {
				System.out.println(myRs.getString("ERS_USERNAME"));
			}
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}
}
