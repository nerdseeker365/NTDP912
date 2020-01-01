package com.nt.test;

import com.nt.sdp.Printer1;

public class TicketBookingServlet1 implements Runnable {

	@Override
	public void run()   {
	   Printer1 p1=null;
		System.out.println("TicketBookingServlet.run()");
		try {
		p1=Printer1.getInstance();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(p1.hashCode());
	}

}
