package com.practice.tester;

import java.sql.SQLException;

import com.practice.businessbean.BusinessBean;
import com.practice.servicedao.StudentServiceImpl;

public class StudentTester {

	

	public  static void insertstudent()
	{
		BusinessBean bean = new BusinessBean();
		bean.setStudentid(1001);
		bean.setStudentname("Rohit");
		bean.setStudentrollno(35);
		
		StudentServiceImpl stud = new StudentServiceImpl();
		
		try {
			stud.insertstudent(bean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          insertstudent();
	}

}
