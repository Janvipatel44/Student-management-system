package StudentManagement.Connection.userConnection;

import java.sql.*;

public class UserConnection
{
	//Driver and URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/projectstudentmanagement";

	//User Name and Password
	static final String USER = "root";
	static final String PASSWORD = "DCplaza7*2030";
	
	private static Connection userConnection = null;

	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		if(userConnection != null)
			return userConnection;
		
		else
		{
			try{
				   //Register JDBC driver
				   Class.forName("com.mysql.jdbc.Driver");

				   //Open a connection
				   System.out.println("Connecting to database...");
				   userConnection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
				   
				   return userConnection;
			}
			finally
			{}
		}
	}
	
	public static void closeConnection() throws SQLException
	{
		try
		{
			if(userConnection != null)
				userConnection.close();
		}
		finally
		{}
	}

}
