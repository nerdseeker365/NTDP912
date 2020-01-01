package com.nt.test;

import com.nt.sdp.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run()   {
	   Printer p1=null;
		System.out.println("TicketBookingServlet.run()");
		try {
		p1=Printer.INSTANCE;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1.hashCode());
	}

}
