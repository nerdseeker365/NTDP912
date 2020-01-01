package com.nt.delegate;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.nt.bo.FinanceEmployeeBO;
import com.nt.bo.HREmployeeBO;
import com.nt.cfgs.Log4jConfiguration;
import com.nt.dao.FinanceEmployeeDAO;
import com.nt.dao.HREmployeeDAO;
import com.nt.errors.EmployeeRegistrationProblem;
import com.nt.factory.ConnectionFactory;
import com.nt.vo.EmployeeVO;

public class EmployeeMgmtBusinessDelegate {
      private HREmployeeDAO dao1=null;
      private  FinanceEmployeeDAO dao2=null;
      private static Logger logger=Logger.getLogger(EmployeeMgmtBusinessDelegate.class);
      
      static {
    	  Log4jConfiguration.congfigure();
    	  logger.debug("Log4j is acitivated");
      }
	
	public EmployeeMgmtBusinessDelegate() {
		dao1=new HREmployeeDAO();
		dao2=new FinanceEmployeeDAO();
		logger.debug("dao classes objets are created");
	}
	
	public    String  regsiterEmployee(EmployeeVO vo)throws EmployeeRegistrationProblem{
		   HREmployeeBO  hrBO=null;
		   FinanceEmployeeBO financeBO=null;
		   Connection con=null;
		   boolean flag=false;
		   String msg=null;
		   try {
			   //convert VOs to BOs  (usecase1)
			   hrBO=new HREmployeeBO();
			   hrBO.setEname(vo.getEname());
			   hrBO.setDesg(vo.getDesg());
			   hrBO.setEadd(vo.getEadd());
			   
			   financeBO=new FinanceEmployeeBO();
			   financeBO.setEname(vo.getEname());
			   financeBO.setEadd(vo.getEadd());
			   financeBO.setSalary(Float.parseFloat(vo.getSalary()));
			   logger.info("Here VO's are conveted to BOs");
			   //get Conn obj from ConnectionFactory
			   con=ConnectionFactory.getPooledConnection();
			   logger.debug("con object gahted from jdbccon pool");
			   //begin Transaction 
			   con.setAutoCommit(false);
			   logger.debug("Tx started");
			   //use dAO
			   dao1.insert(hrBO, con);
			   dao2.insert(financeBO, con);
			   flag=true;
		   }
		   catch (SQLException se) {
		   		se.printStackTrace();
			   logger.error("EmployeeMgmtBusinessDelegate: SQL Prboblem");
			   flag=false;
			 if(se.getErrorCode()==1)
				 throw new EmployeeRegistrationProblem("Employee already registered");  //usecase2
			 else if(se.getErrorCode()==12899)
				 throw new EmployeeRegistrationProblem("certain column value is more lenthy"); //useacase2
			 else
				 throw new EmployeeRegistrationProblem("unknown  DB Problem"); //usecase2
		}
		   catch(Exception e) {
			   		e.printStackTrace();
			   logger.error("EmployeeMgmtBusinessDelegate: internal problem");
			   flag=false;
			   throw new EmployeeRegistrationProblem("unknown Internal Problem"); //usecase2
		   }
		   finally {
			   //TransactionManagement
			   try {
			   if(flag) {
				   con.commit();  //usecase3
				   msg="Registration completed --(Tx Committed)";
				   logger.info("Tx obj is committed");
			   }
			   else {
				   con.rollback();  //usecase3
				   msg="Registration failed--(Tx rolledback)";
				   logger.info("Tx is falied");
			   }
			   }//try
			   catch(Exception e) {
				   e.printStackTrace();
				   msg="Registration failed--(Tx rolledback)";
				   logger.info("Tx is falied");
			  }
			   //close connection
			   try {
				   if(con!=null)
					  ConnectionFactory.closeConnection(con);
				   logger.debug("connection is closed");
			   }
			   catch(SQLException se) {
				   se.printStackTrace();
				 logger.error("unknow Db problem");
			   }
			  
		   } //finanlly
		   return msg;
	}//method
	
	
}//class
