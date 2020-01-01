package com.nt.adapter;

import com.nt.dto.CardInfoDTO;
import com.nt.external.PaypalComp;
import com.nt.external.PaypalCompImpl;

public class BankNameToBankCodeAdapter {

	public  static  String  convertBankNameToBankCodeAndDoPayment(CardInfoDTO dto) {
	      int bankCode=0;
	      PaypalComp extComp=null;
	      String result=null;
	      
		//convert  BankNameTo BankCode
		if(dto.getBankName().equalsIgnoreCase("SBI"))
			bankCode=1001;
		else if(dto.getBankName().equalsIgnoreCase("HDFC"))
			bankCode=1002;
		else if(dto.getBankName().equalsIgnoreCase("ICICI"))
			bankCode=1003;
		else if(dto.getBankName().equalsIgnoreCase("AXIS"))
			bankCode=1004;
		else
			 throw new IllegalArgumentException("invalid  bankName");
		dto.setBankCode(bankCode);
		//get Extenal comp reference
		extComp=PaypalCompImpl.INSTANCE;
		 //invoke the method
		 result=extComp.doPayment(dto);
		 return result;
	}
	
}
