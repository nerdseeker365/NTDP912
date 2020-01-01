package com.nt.external;

import java.util.Random;

import com.nt.dto.CardInfoDTO;

public enum PaypalCompImpl implements PaypalComp {
	 INSTANCE;
	
	@Override
	//B.method having b.logic
	public String doPayment(CardInfoDTO dto) {
		Random rad=null;
		rad=new Random();
		return  "TxId ::"+rad.nextInt(1000000)+" transaction is successfully comppled for the amount::"+dto.getAmount();
	}

}
