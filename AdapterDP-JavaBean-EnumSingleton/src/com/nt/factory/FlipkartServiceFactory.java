package com.nt.factory;

import com.fpkt.service.FlipkartService;
import com.fpkt.service.FlipkartServiceImpl;

public class FlipkartServiceFactory {
	
     public   static FlipkartService   getInstance() {
    	 return  new FlipkartServiceImpl();
     }

}
