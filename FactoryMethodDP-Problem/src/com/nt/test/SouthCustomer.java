package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.ChennaiBajajBikeFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike=null;
		bike=ChennaiBajajBikeFactory.getInstance("discover");
		bike.drive();

	}

}
