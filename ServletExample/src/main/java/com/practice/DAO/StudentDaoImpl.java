package com.practice.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.practice.businessbean.BusinessBean;
import com.practice.dbconnection.DatabaseConnection;

public class StudentDaoImpl implements StudentDao {

   public static Connection connection =null;
   public static Statement statement = null;
	public int insertstudent(BusinessBean bean) throws ClassNotFoundException, SQLException 
	{
		// TODO Auto-generated method stub
	
	  int id=bean.getStudentid();
	  String name= bean.getStudentname();
	  int rollno= bean.getStudentrollno();
		
	  String insertdata="insert into student values('" + id + "', '" + name + "','"+ rollno +"')";
	  connection= DatabaseConnection.getDBconnection();
	  statement=connection.createStatement();
	  int rowcount =statement.executeUpdate(insertdata);
	  
	  if(rowcount>0)
	  {
		  System.out.println("insert data successfully");
	  }
	  else
	  {
		  System.out.println("data not inserted");
	  }
	return rowcount;
		  
	}

}
