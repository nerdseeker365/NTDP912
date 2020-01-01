package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class IcelandCustomer {
	public static void main(String[] args) {
		  House house=null;
		  house=HouseFactory.getInstance("ice");
		  System.out.println(house);
		  
	}

}
