package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer;

public class SingletonTest5 {

	public static void main(String[] args)  throws  Exception {
		Printer pu1=null,pu2=null;
		Class c=null;
		Constructor cons[]=null;
		// create Object for singleton java class
		pu1=Printer.INSTANCE;
		System.out.println("pu1 hashCode:"+pu1.hashCode());
		//get  java.lang.Class obj hoilding Printer 
		c=pu1.getClass();
		// get all the constructors of  Printer class
		cons=c.getDeclaredConstructors();
		// get Access to private constructor
		cons[0].setAccessible(true);
		try {
		//create object
		pu2=(Printer)cons[0].newInstance(null);
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
		System.out.println(pu1.hashCode()+"  "+pu2.hashCode());
		System.out.println("pu1==pu2"+(pu1==pu2));
	}//main
}//class
