package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class IndianCustomer {
	public static void main(String[] args) {
		  House house=null;
		  house=HouseFactory.getInstance("concrete");
		  System.out.println(house);
		  
	}

}
