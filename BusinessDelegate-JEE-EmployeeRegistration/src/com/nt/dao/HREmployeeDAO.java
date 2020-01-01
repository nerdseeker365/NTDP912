package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.BaseEmployeeBO;
import com.nt.bo.HREmployeeBO;
import com.nt.cfgs.Log4jConfiguration;

public class HREmployeeDAO implements EmployeeDAO {
	private static final String  INSERT_HR_EMP_QUERY="INSERT INTO BD_HR_EMP VALUES(BD_ENO_SEQ.NEXTVAL,?,?,?)";
	private  static  Logger logger=Logger.getLogger(HREmployeeDAO.class);
	static {
		Log4jConfiguration.congfigure();
		logger.debug("log4j is enabled");
	}
	
	@Override
	public void insert(BaseEmployeeBO bo, Connection con) throws SQLException {
		PreparedStatement ps=null;
		logger.debug("insert(-) method");
      try {
    	  //create PreparedStatement object
    	  ps=con.prepareStatement(INSERT_HR_EMP_QUERY);
    	  logger.debug("PreparedStatement obj is created");
    	  //set values to Query params
    	  ps.setString(1,bo.getEname());
    	  ps.setString(2,bo.getEadd());
    	  ps.setString(3,((HREmployeeBO)bo).getDesg());
    	  logger.debug("Values are set query params");
    	  //execut the Query
    	  ps.executeUpdate();
    	  logger.debug("query executed");
      }//try
      catch(SQLException se) {
    	  logger.error("problem in inserting record in HR table", se);
    	  throw se;
      }
      catch(Exception e) {
    	  logger.fatal("unknown problem", e);
    	  throw e;
      }
      finally {
    	  //close jdbc objs
    	  try {
    		  if(ps!=null) {
    			  ps.close();
    			  logger.debug("PrepraedStatement obj is closed");
    		  }
    	  }
    	  catch(SQLException se) {
    		  se.printStackTrace();
    		  logger.error("Problem in closing PreparedStatement obj",se);
    	  }
      }//finally

	}//insert
}//class
