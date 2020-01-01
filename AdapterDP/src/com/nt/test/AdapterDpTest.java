package com.nt.test;

import com.fpkt.service.FlipkartService;
import com.nt.factory.FlipkartServiceFactory;

public class AdapterDpTest {

	public static void main(String[] args) {
		FlipkartService service=null;
		//get FlipkartService object
		service=FlipkartServiceFactory.getInstance();
		//invoke method
		System.out.println(service.shoppingAndPayment(new String[] {"shirt","trouser","shoe","gold"},new float[] {2000,3000,5000,300000},1234567, "SBI"));
		

	}

}
