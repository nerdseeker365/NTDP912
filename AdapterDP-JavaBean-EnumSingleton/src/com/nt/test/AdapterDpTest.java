package com.nt.test;

import com.fpkt.service.FlipkartService;
import com.nt.dto.PaymentInfoDTO;
import com.nt.factory.FlipkartServiceFactory;

public class AdapterDpTest {

	public static void main(String[] args) {
		FlipkartService service=null;
		PaymentInfoDTO dto=null;
		//get FlipkartService object
		service=FlipkartServiceFactory.getInstance();
		//prepare DTO
		dto=new PaymentInfoDTO();
		dto.setItems(new String[] {"shirt","trouser","shoe","gold"});
		dto.setPrices( new float[] {2000,3000,5000,300000});
		dto.setBankName("SBI");
		dto.setCardNo(9000222);
		//invoke method
		System.out.println(service.shoppingAndPayment(dto));
		

	}

}
