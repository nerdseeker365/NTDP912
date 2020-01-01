package com.nt.test;

import com.nt.command.BankService;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
        BankService  service=null;
        //get Object
        //service=BankServiceFactory.getInstance(true);
        service=BankServiceFactory.getInstance(false);
        System.out.println("service obj class name::"+service.getClass());
        //invoke methods
        System.out.println("result is ::"+service.withdraw(1001, 200000));
        System.out.println("..........................");
        System.out.println("result is ::"+service.deposite(1001,300000));
        
	}

}
