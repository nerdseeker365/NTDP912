package com.nt.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ConnectionFactory {
	private static  Logger logger=Logger.getLogger(ConnectionFactory.class);
	
	static {
		try {
		PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
		logger.debug("log4j is activated here");
		}
		catch(Exception e) {
			logger.fatal("Unknown Propblem in Locating Properties file");
			e.printStackTrace();
		}
	}
	
	public static Connection  getInstance(String url,String user,String pwd) throws SQLException{
		Connection con=null;
		logger.debug("start of getInstance() method");
		try {
		//establish the connection
		con=DriverManager.getConnection(url, user, pwd);
		logger.info("jdbc connection is established");
		}
		catch(SQLException se) {
			logger.error("Problem is raised in Connection establishment",se);
			se.printStackTrace();
		}
		catch(Exception e) {
			logger.fatal("unknown DB Problem",e);
			e.printStackTrace();
		}
		logger.debug("end of getInstance() method");
		return con;
	}

}
