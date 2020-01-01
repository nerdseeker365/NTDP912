package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.ExcelCourseDAO;
import com.nt.dao.ExcelStudentDAO;

public class ExcelDAOFactory {
	
	public static   DAO  getInstance(String type) {
		DAO dao=null;
		if(type.equalsIgnoreCase("student"))
			dao=new ExcelStudentDAO();
		else if(type.equalsIgnoreCase("course"))
			dao=new ExcelCourseDAO();
		else
			throw new IllegalArgumentException("Invalid  type");
     return dao;		
	}

}
