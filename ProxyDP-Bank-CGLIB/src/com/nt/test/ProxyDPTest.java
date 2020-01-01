package com.nt.test;

import java.util.Arrays;

import com.nt.command.BankServiceImpl;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
        BankServiceImpl  service=null;
        //get Object
        service=BankServiceFactory.getInstance(true);
        //service=BankServiceFactory.getInstance(false);
        System.out.println("service obj class name::"+service.getClass()+" --->"+service.getClass().getSuperclass()+"---->"+Arrays.toString(service.getClass().getDeclaredMethods()));
        //invoke methods
        System.out.println("result is ::"+service.withdraw(1001, 20000));
        System.out.println("..........................");
        System.out.println("result is ::"+service.deposite(1001,130000));
        
	}

}
