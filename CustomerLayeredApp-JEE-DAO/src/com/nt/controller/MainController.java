package com.nt.controller;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;
import com.nt.service.CustomerServiceImpl;
import com.nt.vo.CustomerVO;

public class MainController {
	private static Logger logger=Logger.getLogger(MainController.class);
	private CustomerService service=null;
	
	static {
		//activate log4j
		PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
	}
	
	public MainController() {
		service=new CustomerServiceImpl();
		logger.info("Service class obj is ready");
	}
	
	public  String processCustomer(CustomerVO vo)throws Exception {
		logger.debug("processCustomer(-) method is called");
		CustomerDTO dto=null;
		String resultMsg=null;
		//convert VO to DTO
		dto=new CustomerDTO();
		dto.setCustName(vo.getCustName());
		dto.setCustAddrs(vo.getCustAddrs());
		dto.setPAmt(Float.parseFloat(vo.getPAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		logger.debug("VO is converted to DTO");
		//use Service
		resultMsg=service.calcSimpleIntrAmount(dto);
		logger.debug("service is used in controller");
		return resultMsg;
	}

}
