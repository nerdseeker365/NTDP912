package com.nt.factory;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.dao.CustomerDAO;
import com.nt.dao.CustomerDAOImpl;

public class CustomerDAOFactory {
	private static  Logger logger=Logger.getLogger(CustomerDAOFactory.class);
	static {
		PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
	}
	public  static  CustomerDAO  getInstance(String type) {
		logger.debug("getInstance(-) method"); 
		if(type.equalsIgnoreCase("jdbc")) {
			logger.debug("DAO class object is created in factory");
			return new  CustomerDAOImpl();
		}
		else
			return null;
	}

}
