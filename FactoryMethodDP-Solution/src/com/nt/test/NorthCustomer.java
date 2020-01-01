package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajBikeModel;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.ChennaiBajajBikeFactory;
import com.nt.factory.NagpurBajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		BajajBike bike=null;
		BajajBikeFactory factory=null;
		
		factory=new NagpurBajajBikeFactory();
		bike=factory.orderBike(BajajBikeModel.BIKE_MODEL_DISCOVER);
		System.out.println("...............");
		bike.drive();
		
	}

}
