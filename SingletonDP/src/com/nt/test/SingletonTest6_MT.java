package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest6_MT {

	public static void main(String[] args) throws Exception {
      TicketBookingServlet1  servlet=null;
      Thread th1=null,th2=null,th3=null;
      servlet=new TicketBookingServlet1();
      //create Threads
      th1=new Thread(servlet);
      th2=new Thread(servlet);
      th3=new  Thread(servlet);
      
      th1.start();
      th2.start();
      th3.start();
       
	}
}
