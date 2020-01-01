package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFactoryDP {

	public static void main(String[] args) {
		DAO stDao=null,crDao=null;
		//get DAOs
		stDao=DBDAOFactory.getInstance("student");
		crDao=ExcelDAOFactory.getInstance("course");
		//use DAos
		stDao.insert();
		crDao.insert();
	}
}
