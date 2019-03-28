package com.revature.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.model.User;
import com.revature.util.ConnectionFactory;

/*
 * 
 * the DOA (data access object) should be the only place where
 * a connection is made to the DB
 * this design pattern allows for a separation of concerns
 * 
 * JDBC java database connectivity
 * 
 * */
public class UserDAO {
	
	
	
	
	/*
	 * STATEMENT - important interface in JDBC API
	 * - takes an SQL statement as a string, executes it, and 
	 * returns the result 
	 * - allow SQL injection. These are not ideal to use. Definitely 
	 * do NOT use for any SQL command that uses a parameter/variable
	 * 
	 * SQL injection - common hacking technique. it is the insertion of
	 * code as input that affects your database 
	 */
	
	public List<User> getUsers(){
		List<User> users = new ArrayList<User>();
		try(Connection conn = 
				ConnectionFactory.getInstance().getConnection()){
			
			 String query = "select * from demo_user";
			 // query = "select * from demo_user where lower(username) = " + username;
			 
			 //STATEMENT interface 
			 Statement statement = conn.createStatement();
			 
			 //RESULTSET interface - represents the set of results of a DB query
			 ResultSet rs = statement.executeQuery(query);
			 
			 while(rs.next()) {
				 User temp = new User(
						 rs.getInt(1),
						 rs.getString("USERNAME"),
						 rs.getString(3),
						 rs.getString("BIO"));
				 users.add(temp);
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	/*
	 * Prepared Statement - execute QUERY
	 */
	
	public User getByUsername(String username) {
		User u = null;
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			String sql = "select * from demo_user where lower(username) = ?  ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username.toLowerCase());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				u =  new User(
						 rs.getInt(1),
						 rs.getString("USERNAME"),
						 rs.getString(3),
						 rs.getString("BIO"));
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	
	/*
	 * Prepared statement to execute UPDATE
	 */
	public User addUser(User u) {
		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			//conn.setAutoCommit(); is set to true
			String sql = "insert into demo_user(username, password, bio) values(?, ?, ?)";
			String[] keyNames = {"U_ID"}; //allows us to specify col names of autogenerated fields to get back after update
			PreparedStatement ps = conn.prepareStatement(sql, keyNames);
			ps.setString(1,  u.getUsername());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getBio());
			
			int numRowsAffected = ps.executeUpdate();
			//could also just call ps.executeUpdate() without setting it equal to anything
			//but we want to see num rows affected
			System.out.println("ADDED " + numRowsAffected +  " USER(S) TO DB");
			
			if(numRowsAffected == 1) {
				ResultSet pk = ps.getGeneratedKeys();
				pk.next();
				u.setId(pk.getInt(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	
}
