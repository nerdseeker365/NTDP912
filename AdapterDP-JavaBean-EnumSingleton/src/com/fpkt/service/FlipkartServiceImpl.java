package com.fpkt.service;

import com.nt.adapter.BankNameToBankCodeAdapter;
import com.nt.dto.CardInfoDTO;
import com.nt.dto.PaymentInfoDTO;

public class FlipkartServiceImpl implements FlipkartService {

	@Override
	public String shoppingAndPayment(PaymentInfoDTO dto) {
		float  billAmt=0.0f;
		String result=null;
		CardInfoDTO cDTO=null;
	  //calc bill Amount
		for(float price:dto.getPrices()) {
			billAmt=billAmt+price;
		}
		//prepare another DTO class obj
		cDTO=new CardInfoDTO();
		cDTO.setCardNo(dto.getCardNo());
		cDTO.setBankName(dto.getBankName());
		cDTO.setAmount(billAmt);
		//doPayment
		result=BankNameToBankCodeAdapter.convertBankNameToBankCodeAndDoPayment(cDTO);
		return result;
	}
}
