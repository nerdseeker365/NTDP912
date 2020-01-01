package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class JapaneesCustomer {
	public static void main(String[] args) {
		  House house=null;
		  house=HouseFactory.getInstance("wooden");
		  System.out.println(house);
		  
	}

}
