package com.practice.DAO;

import java.sql.SQLException;

import com.practice.businessbean.BusinessBean;

public interface StudentDao {

	public int insertstudent(BusinessBean bean) throws ClassNotFoundException, SQLException;
	
	
	
}
