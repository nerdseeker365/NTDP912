package com.nt.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.nt.bo.BaseEmployeeBO;

public interface EmployeeDAO {
	
	public   void insert(BaseEmployeeBO bo,Connection con)throws SQLException;

}
