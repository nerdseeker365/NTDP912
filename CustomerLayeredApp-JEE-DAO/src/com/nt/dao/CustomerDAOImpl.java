package com.nt.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.bo.CustomerBO;
import com.nt.factory.ConnectionFactory;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO CUSTOMER_DAO VALUES(CUSTNO_SEQ.NEXTVAL,?,?,?,?)";

	private static Logger logger=Logger.getLogger(CustomerDAOImpl.class);
	private static Properties props=null;
	
	static {
	   InputStream is=null;	
	
	   try {
		//Activate log4j
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
			logger.debug("Log4j.properties is activated");
		 //get jdbc properties from jdbc.properties
			is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			props=new Properties();
			props.load(is);
			logger.debug("jdbc.properties file info is read into java.util.Properties class obj" );
	   }
	   catch(FileNotFoundException fnf) {
		   logger.error("Problem in locating properties files");
		   fnf.printStackTrace();
	   }
	   catch(IOException ioe) {
		   logger.error("Problem in reading properties files");
		   ioe.printStackTrace();
	   }
	   catch(Exception e) {
		   logger.fatal("UnProblem in reading properties files");
		   e.printStackTrace();
	   }
	}

	@Override
	public int insert(CustomerBO bo) throws SQLException {
		logger.debug("insert method of DAO class");
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
		//create jdbc connecttion
		con=ConnectionFactory.getInstance(props.getProperty("jdbc.url"),props.getProperty("jdbc.username"),props.getProperty("jdbc.pwd"));
		logger.info("Connection established");
		//create PreparedStatement object
		ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		logger.debug("PReparedStatement obj is created");
		//set values to query params
		ps.setString(1, bo.getCustName());
		ps.setString(2,bo.getCustAddrs());
		ps.setFloat(3, bo.getPAmt());
		ps.setFloat(4, bo.getIntrAmt());
		logger.debug("Values are set query param");
		//execute the query
		result=ps.executeUpdate();
		logger.debug("query executed");
		}//try
		catch(SQLException se) {
			logger.error("DB probem "+se.getMessage());
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			logger.fatal("unknow problem::"+e.getMessage());
			e.printStackTrace();
			throw e;
		}
		finally {
			//close jdbc objs
			logger.debug("jdbc objs are closed");
			try {
				if(ps!=null)
					ps.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}
		
		return result;
	}//method
}//class
