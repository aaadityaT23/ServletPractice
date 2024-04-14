package com.practice.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

public static String url = "jdbc:mysql://localhost:3306/school";
public static String userName="root";
public static String password ="Root@123";
public static Connection connection= null;

public static Connection getDBconnection() throws ClassNotFoundException, SQLException
{
	Class.forName("com.mysql.jdbc.Driver");
	connection =DriverManager.getConnection(url,userName,password);
	
	return connection;

}
public static void Dbdestroyconnection() throws SQLException
{
	connection.close();
}

}
