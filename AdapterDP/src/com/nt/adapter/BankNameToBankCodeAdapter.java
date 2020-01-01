package com.nt.adapter;

import com.nt.external.PaypalComp;
import com.nt.external.PaypalCompImpl;

public class BankNameToBankCodeAdapter {

	public  static  String  convertBankNameToBankCodeAndDoPayment(String bankName,int cardNo,float amt) {
	      int bankCode=0;
	      PaypalComp extComp=null;
	      String result=null;
	      
		//convert  BankNameTo BankCode
		if(bankName.equalsIgnoreCase("SBI"))
			bankCode=1001;
		else if(bankName.equalsIgnoreCase("HDFC"))
			bankCode=1002;
		else if(bankName.equalsIgnoreCase("ICICI"))
			bankCode=1003;
		else if(bankName.equalsIgnoreCase("AXIS"))
			bankCode=1004;
		else
			 throw new IllegalArgumentException("invalid  bankName");
		//get Extenal comp reference
		extComp=PaypalCompImpl.getInstance();
		 //invoke the method
		 result=extComp.doPayment(cardNo, bankCode, amt);
		 return result;
	}
	
}
