package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.BajajBikeModel;
import com.nt.bike.BajajDiscoverBike;
import com.nt.bike.BajajPulsorBike;

public class ChennaiBajajBikeFactory extends BajajBikeFactory {
	    
	    public   BajajBike  getInstance(String type) {
	    	BajajBike bike=null;
	    	if(type.equalsIgnoreCase(BajajBikeModel.BIKE_MODEL_DISCOVER))
	    		bike=new BajajDiscoverBike();
	    	else if(type.equalsIgnoreCase(BajajBikeModel.BIKE_MODEL_PULSOR))
	    		bike=new BajajPulsorBike();
	    	else
	    		throw new IllegalArgumentException("invalid bike");
	    	   return bike;
	    }//method
}//class
