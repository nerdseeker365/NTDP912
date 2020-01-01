package com.nt.sdp;

public class Printer1 {
	
	private Printer1() {
		System.out.println("Printer1:: 0-param constructor");
	}
	
	private static class  PrinterHolder{
		static  Printer1  INSTANCE=new Printer1();
	}
	
	public  static   Printer1 getInstance() {
		return  PrinterHolder.INSTANCE;
	}
	

}
