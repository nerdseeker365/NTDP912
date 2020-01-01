package com.nt.external;

import java.util.Random;

public class PaypalCompImpl implements PaypalComp {
	private static  PaypalComp  INSTANCE;
	
	private  PaypalCompImpl() {
		System.out.println("PayPalCompImpl:: 0-param constructor");
	}
	
	//to stop cloning
	public  Object clone()throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	//to stop deSerialization
	public  Object readResolve() {
		return  INSTANCE;
	}
	
	public static PaypalComp  getInstance() {
       if(INSTANCE==null) {
		synchronized (PaypalComp.class) {
 		   if(INSTANCE==null)
			     INSTANCE=new PaypalCompImpl();
		  }
       }
		   return INSTANCE;
	}
	

	@Override
	public String doPayment(int cardNo, int bankCode, float amt) {
		Random rad=null;
		rad=new Random();
		return  "TxId ::"+rad.nextInt(1000000)+" transaction is successfully comppled for the amount::"+amt;
	}

}
