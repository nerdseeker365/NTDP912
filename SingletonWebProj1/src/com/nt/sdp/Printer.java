package com.nt.sdp;

import javax.management.InstanceAlreadyExistsException;

import com.nt.util.CommonsUtil;

public class Printer extends CommonsUtil
{
	
	
	//private static final long serialVersionUID = 7201784221271325127L;
	private static final long serialVersionUID = 3133877619404484311L;
	//private static final long serialVersionUID = 1L;
	private  static Printer  INSTANCE=new Printer();
	//private  static Printer  INSTANCE;
	private static  boolean  isInstantiated=false;
	
	private Printer() {
		if(INSTANCE!=null)
			throw new IllegalArgumentException("Object already created");
		System.out.println("Printer:0-param constructor");
		
	}
	
	
	
	/*//0-param constructor private
	private  Printer() throws InstanceAlreadyExistsException {
		if(isInstantiated)
			 throw new InstanceAlreadyExistsException("Object alread created");
		else
			isInstantiated=true;
		System.out.println("Printer: 0-param constructor (private)");
	}*/
	
	//static factory method
	/*public synchronized  static  Printer getInstance() {
		  
		if(INSTANCE==null)
		    INSTANCE=new Printer();
		
		return INSTANCE;
	}*/
	
	/*public  static  Printer getInstance()throws InstanceAlreadyExistsException {
	
	if(INSTANCE==null) {
			synchronized (Printer.class) {
		if(INSTANCE==null)
		    INSTANCE=new Printer();
		     //isInstantiated=true;
	  }
	}
		return INSTANCE;
	} */
	
	@Override
	public Object clone() throws CloneNotSupportedException {
	    //throw new CloneNotSupportedException("Cloning is not Possible");
	    return INSTANCE;
	}
	
	public  Object  readResolve() {
		//throw new  IllegalArgumentException("DeSerialization is not supported");
		return INSTANCE;
	}
	
	
	//static factory method
		public   static  Printer getInstance() {
			return INSTANCE;
		} 

}
