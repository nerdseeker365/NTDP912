package com.nt.factory;

import com.nt.command.BankServiceImpl;
import com.nt.proxy.ProxyHelper;

import net.sf.cglib.proxy.Enhancer;

public class BankServiceFactory {
	
	public static BankServiceImpl getInstance(boolean  isDemonitazionEnabled) {
		BankServiceImpl  service=null;
		if(isDemonitazionEnabled)
			service=(BankServiceImpl) Enhancer.create(BankServiceImpl.class, new ProxyHelper()); //proxy class
		else
			service=new BankServiceImpl();  //real object
		
		return service;
	}

}
