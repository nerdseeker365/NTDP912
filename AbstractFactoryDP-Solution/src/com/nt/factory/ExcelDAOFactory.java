package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.ExcelCourseDAO;
import com.nt.dao.ExcelStudentDAO;

public class ExcelDAOFactory extends DAOFactory {
	
	public    DAO  getInstance(String type) {
		DAO dao=null;
		if(type.equalsIgnoreCase(DAOType.DAO_TYPE_STUDENT))
			dao=new ExcelStudentDAO();
		else if(type.equalsIgnoreCase(DAOType.DAO_TYPE_COURSE))
			dao=new ExcelCourseDAO();
		else
			throw new IllegalArgumentException("Invalid  type");
     return dao;		
	}

}
