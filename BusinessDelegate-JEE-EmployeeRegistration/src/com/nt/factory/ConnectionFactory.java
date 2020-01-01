package com.nt.factory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.log4j.Logger;

import com.nt.cfgs.Log4jConfiguration;

public class ConnectionFactory {
	private static Logger logger=Logger.getLogger(ConnectionFactory.class);
	private static DataSource ds;
	static {
		InitialContext ic=null;
		ResourceBundle bundle=null;
		String jndi=null;
		try {
			//activate log4j
			Log4jConfiguration.congfigure();
			logger.debug("log4j activated");
			//Locate Properties file
			bundle=ResourceBundle.getBundle("com/nt/commons/jdbc");
			logger.debug("jdbc.properties file is located");
			//get the value from key
			jndi=bundle.getString("datasource.jndi");
			logger.debug("datasource jndi name  is gathered from jdbc.properties");
			//create InitialContext object
			ic=new InitialContext();
			// get Datasource object
			ds=(DataSource) ic.lookup(jndi);
			logger.debug("lookup operation is completed to get Datasource obj");
		}
		catch(NamingException ne) {
			logger.error("problem in gathering Datasource obj",ne);
			ne.printStackTrace();
		}
		catch(Exception e) {
			logger.fatal("unknown internal problem ",e);
			e.printStackTrace();
		}
	}
    
	public  static Connection  getPooledConnection() throws SQLException {
		  Connection con=null;
		//return pooled jdbc con object
		  con=ds.getConnection();
		  logger.info("pooled jdbc con obj is gathered");
		  return con;
    }
	
	public static  void closeConnection(Connection con)throws SQLException{
		//return pooled jdbc con object back to jdbc con pool
		  con.close();
		  logger.info("pooled jdbc con obj is returned back to jdbc con pool" );
	}
}
