package com.nt.factory;

import com.nt.dao.DAO;

public abstract class DAOFactory {
    
	 public  abstract  DAO   getInstance(String type);
	
	public  static DAOFactory getFactoryInstance(String storeType) {
		DAOFactory  factory=null;
		if(storeType.equalsIgnoreCase(DAOFactoryType.FACTORY_TYPE_DB))
			 factory=new DBDAOFactory();
		else if(storeType.equalsIgnoreCase(DAOFactoryType.FACTORY_TYPE_EXCEL))
			factory=new ExcelDAOFactory();
		else
			throw new IllegalArgumentException("invalid factory");
		return factory;
	}
	
	
}
