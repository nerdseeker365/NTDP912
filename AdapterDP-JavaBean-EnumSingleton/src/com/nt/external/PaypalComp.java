package com.nt.external;

import com.nt.dto.CardInfoDTO;

public interface PaypalComp {
	public  String    doPayment(CardInfoDTO  dto);

}
