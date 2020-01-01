package com.nt.factory;

import com.nt.command.BankService;
import com.nt.command.BankServiceImpl;
import com.nt.proxy.BankServiceProxy;

public class BankServiceFactory {
	
	public static BankService getInstance(boolean  isDemonitazionEnabled) {
		BankService  service=null;
		if(isDemonitazionEnabled)
			service=new BankServiceProxy();  //proxy obj
		else
			service=new BankServiceImpl();  //real object
		
		return service;
	}

}
