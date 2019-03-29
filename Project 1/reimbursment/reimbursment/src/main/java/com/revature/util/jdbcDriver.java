package com.revature.util;


import java.sql.*;

public class jdbcDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Connection conn = null;

		try {
			//1.get the connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://twmysql.cbcizsywp3kr.us-east-1.rds.amazonaws.com:3306/TWReimbursements","TiffyW", "1Babygirl");
			
			
			//2. create a statement
			Statement myStmt = conn.createStatement();
			
			//3. execute the query
			ResultSet myRs = myStmt.executeQuery("select * from TWReimbursements.ERS_REIMBURSMENT_TYPE");
			
			
			
			 //4. process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("REIMB_TYPE"));
			 
			}
			
		
		}catch(Exception exc) {
			exc.printStackTrace();
		}
		

	

}

}