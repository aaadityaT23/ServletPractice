package com.practice.servicedao;

import java.sql.SQLException;

import com.practice.DAO.StudentDaoImpl;
import com.practice.businessbean.BusinessBean;

public class StudentServiceImpl implements StudentService {
	
	
	 StudentDaoImpl studentdao = new  StudentDaoImpl();
	
	public int insertstudent(BusinessBean bean) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return studentdao.insertstudent(bean);
	}

}
