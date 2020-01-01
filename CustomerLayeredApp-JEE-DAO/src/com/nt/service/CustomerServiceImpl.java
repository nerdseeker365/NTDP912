package com.nt.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;
import com.nt.factory.CustomerDAOFactory;


public class CustomerServiceImpl implements CustomerService {
	private static Logger logger=Logger.getLogger(CustomerServiceImpl.class);
	private CustomerDAO dao;
	private static Properties props;
	static {
		InputStream is=null;
		try {
			//Activate Log4j
			PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
		//collect info from jdbc.properties
			is=new FileInputStream("src/com/nt/commons/jdbc.properties");
			props=new Properties();
			props.load(is);
			logger.info("jdbc.properties file data stored into java.util.Properties obj");
		}
		catch(FileNotFoundException fne) {
			logger.error("Problem in loading Properties files");
			fne.printStackTrace();
		}
		catch(Exception e) {
			logger.fatal("Unknown Problem in loading Properties files");
			e.printStackTrace();
		}
		
	}
	public CustomerServiceImpl() {
		//get DAO class obj through factory
		dao=CustomerDAOFactory.getInstance(props.getProperty("customer.dao.type"));
		logger.info("DAO class obj is gathered through Factory");
	}
	
	@Override
	public String calcSimpleIntrAmount(CustomerDTO dto) throws Exception {
		logger.debug("calcSimpleIntrAmount(-) method");
		int count=0;
		CustomerBO bo=null;
		float intrAmt=0.0f;
		// calc  intr amount  (b.logic)
		intrAmt=(dto.getPAmt()*dto.getRate()*dto.getTime())/100.0f;
		logger.debug("Simple Intrest amount is calculated");
		//convert DTO to BO
		bo=new CustomerBO();
		bo.setCustName(dto.getCustName());
		bo.setCustAddrs(dto.getCustAddrs());
		bo.setPAmt(dto.getPAmt());
		bo.setIntrAmt(intrAmt);
		logger.debug("DTO class obj is converted to BO class object");
		//use DAO
		count=dao.insert(bo);
		logger.debug("DAO is used in service class");
		if(count==0)
			return "Customer registration failed";
		else
			return "Customer registration succeded::: Intr Amount is::"+intrAmt;
		
	}
}
