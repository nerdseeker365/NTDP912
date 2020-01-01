package com.nt.proxy;

import com.nt.command.BankService;
import com.nt.command.BankServiceImpl;

public class BankServiceProxy implements BankService {
	  private BankService  service;
	public BankServiceProxy() {
		System.out.println("BankServiceProxy:: 0-param constructor");
		 service=new BankServiceImpl();
	}

	@Override
	public String withdraw(int acno, float amt) {
		String result=null;
		if(amt<=4000)
			result=service.withdraw(acno, amt);
		else{
			result=service.withdraw(acno, 4000);
			result=result+" (Only 4 thousand is limit to withdraw , So we can not allow to withdraw u r amount:: "+amt+")";
		}
		return result;
	}

	@Override
	public String deposite(int acno, float amt) {
		String result=null;
		if(amt<=50000)
			result=service.deposite(acno, amt);
		else{
			result=service.deposite(acno, 50000);
			result=result+" (Only 50000 thousand is limit to deposite , So we can not allow to deposite u r amount:: "+amt+")";
		}
		return result;
	}

}
