package com.practice.servicedao;

import java.sql.SQLException;

import com.practice.businessbean.BusinessBean;

public interface StudentService {
	public int insertstudent(BusinessBean bean) throws ClassNotFoundException, SQLException;
}
