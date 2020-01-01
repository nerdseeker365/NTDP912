package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest3 {

	public static void main(String[] args)  throws Exception {
		Printer pu1=null,pu2=null;
		//get Printer Object
		pu1=Printer.getInstance();
		//create object through cloning
		try {
		pu2=(Printer) pu1.clone();
		System.out.println(pu1.hashCode()+"  "+pu2.hashCode());
		System.out.println("pu1==pu2?"+(pu1==pu2));
		}
		catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
		
		
           
	}
}
