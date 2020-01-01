package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class NagpurBajajBikeFactory extends BajajBikeFactory{
	    public   BajajBike  getInstance(String type) {
	    	BajajBike bike=null;
	    	if(type.equalsIgnoreCase("discover"))
	    		bike=new BajajDiscoverBike();
	    	else if(type.equalsIgnoreCase("pulsor"))
	    		bike=new BajajPulsorBike();
	    	else
	    		throw new IllegalArgumentException("invalid bike");
	    	   return bike;
	    }//method
}//class
