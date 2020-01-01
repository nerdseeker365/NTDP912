package com.nt.director;

import com.nt.builder.HouseBuilder;
import com.nt.product.House;

public class CiviEngineer {
	private HouseBuilder builder;
	
	public CiviEngineer(HouseBuilder builder) {
		System.out.println("CiviEngineer.1-param constructor");
		 this.builder=builder;
	}
	
	public  House getHouse() {
		System.out.println("CiviEngineer.getHouse()");
		 return  builder.getHouse();
	}
	
	//  define the process of creating complex object
	public   void constructHouse() {
		System.out.println("CiviEngineer.constructHouse()");
		builder.buildBasement();
		builder.buildStructure();
		builder.buildRoof();
		builder.buildInterior();
	}
	
	

}
