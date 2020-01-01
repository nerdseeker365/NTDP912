package com.nt.factory;

import com.nt.builder.ConcreteHouseBuilder;
import com.nt.builder.HouseBuilder;
import com.nt.builder.IglooHouseBuilder;
import com.nt.builder.WoodenHouseBuilder;
import com.nt.director.CiviEngineer;
import com.nt.product.House;

public class HouseFactory {
	
	public  static   House  getInstance(String type) {
	    HouseBuilder  builder=null;
	    CiviEngineer engineer=null;
	    if(type.equalsIgnoreCase("concrete"))
	    	 builder=new ConcreteHouseBuilder();
	    else if(type.equalsIgnoreCase("wooden"))
	    	builder=new WoodenHouseBuilder();
	    else if(type.equalsIgnoreCase("ice"))
	    	 builder=new IglooHouseBuilder();
	    else
	    	throw new IllegalArgumentException("invalid house type");
	    //construct the house 
	    engineer=new CiviEngineer(builder);
	    engineer.constructHouse();
	    return engineer.getHouse();
	}

}
