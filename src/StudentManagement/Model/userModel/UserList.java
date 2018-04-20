package StudentManagement.Model.userModel;

import java.sql.*;

import StudentManagement.Common.MyException;
import StudentManagement.Connection.userConnection.UserConnection;


public class UserList extends User
{	
	public void addUser(User newUser) throws SQLException, ClassNotFoundException, Exception
	{
		   Connection conn = UserConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql, check;
		   ResultSet myResult;
		   int cnt = 0;
		   
		   check = "SELECT UserID FROM projectstudentmanagement.tbluser";
		   myResult = stmt.executeQuery(check);
		   
		   while(myResult.next())
		   {
			   if((myResult.getString("UserID")).equals(newUser.getUser()))
			   {
				   cnt++;
			   }
		   }
		   
		   if(cnt == 0)
		   {
			   sql = "INSERT INTO tbluser VALUES('" + newUser.getUser() + " ', '" + newUser.getName() + "', '" + newUser.getContact() + "', '" + newUser.getEmail() + "', '" + newUser.getPassword() + "')";
			   stmt.execute(sql);
		   }
		   else
		   {
			   throw new MyException("User ID already Exists! Try Another!");
		   }
	}
	
	public boolean searchUser(String ID, String Password) throws SQLException, ClassNotFoundException, Exception
	{	
		   Connection conn = UserConnection.getConnection();
		   Statement stmt = conn.createStatement();
		   String sql;
		   int cnt = 0;
		   sql = "SELECT * FROM projectstudentmanagement.tbluser WHERE UserID = '" + ID + "' AND Password = '" + Password + "' ";
		   	   
		   ResultSet myResult;
		   
		   myResult = stmt.executeQuery(sql);
		   
		   while(myResult.next())	
			   cnt++;
			
		    if(cnt == 1)
		    	return true;
		    else
		    	return false;
	}
	
	public boolean changePassword(String ID, String CurrentPassword) throws SQLException, ClassNotFoundException
	{
		Connection conn = UserConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql;
		int cnt = 0;
		sql = "SELECT * FROM projectstudentmanagement.tbluser WHERE UserID = '" + ID + "' AND Password = '" + CurrentPassword + "' ";
		   	   
		ResultSet myResult;
		   
		myResult = stmt.executeQuery(sql);
		   
		while(myResult.next())	
		   cnt++;
			
		if(cnt == 1)
			return true;
		else
			return false;
	}

	public boolean forgotPassword(String ID, String Email) throws SQLException, ClassNotFoundException
	{
		Connection conn = UserConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql;
		int cnt = 0;
		sql = "SELECT * FROM projectstudentmanagement.tbluser WHERE UserID = '" + ID + "' AND UserEmail = '" + Email + "' ";
		   	   
		ResultSet myResult;
		   
		myResult = stmt.executeQuery(sql);
		   
		while(myResult.next())	
		   cnt++;
			
		if(cnt == 1)
			return true;
		else
			return false;
	}
	
	public void updatePassword(String ID, String NewPassword) throws SQLException, ClassNotFoundException
	{
		Connection conn = UserConnection.getConnection();
		Statement stmt = conn.createStatement();
		String sql;
	
		sql = "UPDATE projectstudentmanagement.tbluser SET Password = '" + NewPassword + "' WHERE UserID = '" + ID + "'";
		stmt.executeUpdate(sql);
	}
	
}