package com.nt.factory;

import com.nt.hr.HireDotNetFresher;
import com.nt.hr.HireFresher;
import com.nt.hr.HireJavaFresher;
import com.nt.hr.HirePHPFresher;

public class HireFresherFactory {
	
	public  static  HireFresher  getInstance(String type) {
		HireFresher fresher=null;
		if(type.equalsIgnoreCase("java"))
			fresher=new HireJavaFresher();
		else if(type.equalsIgnoreCase(".net"))
			fresher=new HireDotNetFresher();
		else if(type.equalsIgnoreCase("php"))
			fresher=new HirePHPFresher();
		else
			throw new IllegalArgumentException("invalid fresher type");
		return fresher;
	}

}
