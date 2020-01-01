package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class NagpurBajajBikeFactory {
	    private static  void  assemble() {
	    	System.out.println("NagpurBajajBikeFactory:assemble()");
	    }
	    private  static  void  paint() {
	    	System.out.println("NagpurBajajBikeFactory.paint()");
	    }
	    private static  void roadTest() {
	    	System.out.println("NagpurBajajBikeFactory.roadTest()");
	    }
	    private static  void packing() {
	    	System.out.println("NagpurBajajBikeFactory.packing()");
	    }
	    public static  BajajBike  getInstance(String type) {
	    	BajajBike bike=null;
	    	if(type.equalsIgnoreCase("discover"))
	    		bike=new BajajDiscoverBike();
	    	else if(type.equalsIgnoreCase("pulsor"))
	    		bike=new BajajPulsorBike();
	    	else
	    		throw new IllegalArgumentException("invalid bike");
	    	   assemble();
	    		paint();
	    		roadTest();
	    	   packing();
	    	   return bike;
	    }//method
}//class
