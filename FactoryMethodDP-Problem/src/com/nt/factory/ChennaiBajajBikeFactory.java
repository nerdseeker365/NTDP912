package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class ChennaiBajajBikeFactory {
	    private static  void  assemble() {
	    	System.out.println("ChennaiBajajBikeFactory:assemble()");
	    }
	    private  static  void  paint() {
	    	System.out.println("ChennaiBajajBikeFactory.paint()");
	    }
	    private static  void roadTest() {
	    	System.out.println("ChennaiBajajBikeFactory.roadTest()");
	    }
	    private static  void packing() {
	    	System.out.println("ChennaiBajajBikeFactory.packing()");
	    }
	    public static  BajajBike  getInstance(String type) {
	    	BajajBike bike=null;
	    	if(type.equalsIgnoreCase("discover"))
	    		bike=new BajajDiscoverBike();
	    	else if(type.equalsIgnoreCase("pulsor"))
	    		bike=new BajajPulsorBike();
	    	else
	    		throw new IllegalArgumentException("invalid bike");
	    		paint();
	    	   assemble();
	    	   packing();
	    	   return bike;
	    }//method
}//class
