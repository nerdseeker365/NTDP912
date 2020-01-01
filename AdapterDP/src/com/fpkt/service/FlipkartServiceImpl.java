package com.fpkt.service;

import com.nt.adapter.BankNameToBankCodeAdapter;

public class FlipkartServiceImpl implements FlipkartService {

	@Override
	public String shoppingAndPayment(String[] items, float[] prices,int cardNo,String bankName) {
		float  billAmt=0.0f;
		String result=null;
	  //calc bill Amount
		for(float price:prices) {
			billAmt=billAmt+price;
		}
		//doPayment
		result=BankNameToBankCodeAdapter.convertBankNameToBankCodeAndDoPayment(bankName, cardNo, billAmt);
		return result;
	}
}
