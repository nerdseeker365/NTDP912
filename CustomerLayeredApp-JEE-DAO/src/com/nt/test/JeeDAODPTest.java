package com.nt.test;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class JeeDAODPTest {
	private static Logger logger=Logger.getLogger(JeeDAODPTest.class);
	
	static {
		PropertyConfigurator.configure("src/com/nt/commons/log4j.properties");
	}

	public static void main(String[] args) {
		logger.debug("start of main(-) method");
		Scanner sc=null;
		String name=null,addrs=null,pAmt=null,rate=null,time=null;
		CustomerVO vo=null;
		MainController controller=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("enter Customer name::");
		name=sc.next();
		System.out.println("Enter  customer address::");
		addrs=sc.next();
		System.out.println("enter  Principle Amount::");
		pAmt=sc.next();
		System.out.println("enter rate of Intrest:: ");
		rate=sc.next();
		System.out.println("enter Time ::");
		time=sc.next();
		logger.debug("inputs are gathered from enduser");
		
		//create VO class obj having  inputs
		vo=new CustomerVO();
		vo.setCustName(name); vo.setCustAddrs(addrs);
		vo.setPAmt(pAmt); vo.setRate(rate); vo.setTime(time);
		logger.debug("VO class obj is created having inputs");
		//create Controller class object
		controller=new MainController();
		logger.debug("controller is object is ready");
		try {
		System.out.println("Result::"+controller.processCustomer(vo));
		logger.info("B.method is invoked");
		}
		catch(Exception e) {
			logger.fatal("Problem in B.method invocation");
			e.printStackTrace();
		}
		
	logger.debug("End of Main(-) and End of Application");
	}//main
}//class
