package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.sessionfacade.IccCrickterProfileSessionFacade;
import com.nt.sessionfacade.IccCrickterProfileSessionFacadeImpl;

public class IccCrickterSessionFacadeLocator {
	private  static  IccCrickterSessionFacadeLocator  INSTANCE=null;
	private Map<String,IccCrickterProfileSessionFacade>  cache=null;
	
	private IccCrickterSessionFacadeLocator() {
		cache=new HashMap();
	}
	
	public   static  IccCrickterSessionFacadeLocator  getInstance() {
		 if(INSTANCE==null)
			 INSTANCE=new IccCrickterSessionFacadeLocator();
		 
		 return INSTANCE;
	}
	
	public   IccCrickterProfileSessionFacade  getSessionFacade(String jndi) {
		 IccCrickterProfileSessionFacade facade=null;
		    if(!cache.containsKey(jndi)) {
              facade=new IccCrickterProfileSessionFacadeImpl();
              cache.put(jndi, facade);
		    }
		    return  cache.get(jndi);
	}
	

}
