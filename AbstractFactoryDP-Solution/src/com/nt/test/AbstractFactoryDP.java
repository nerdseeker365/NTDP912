package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryType;
import com.nt.factory.DAOType;


public class AbstractFactoryDP {

	public static void main(String[] args) {
		DAOFactory factory=null;
		DAO stDao=null,crDao=null;
		//get DAO Fcatory
		 factory= DAOFactory.getFactoryInstance(DAOFactoryType.FACTORY_TYPE_DB);
		 //get DAOs
		 stDao=factory.getInstance(DAOType.DAO_TYPE_STUDENT);
		 crDao=factory.getInstance(DAOType.DAO_TYPE_COURSE);
		//use DAos
		stDao.insert();
		crDao.insert();
	}
}
