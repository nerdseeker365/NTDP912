package com.nt.test;

import com.nt.sdp.Printer;

public class SingletonTest2 {

	public static void main(String[] args) throws Exception {
      TicketBookingServlet  servlet=null;
      Thread th1=null,th2=null,th3=null;
      servlet=new TicketBookingServlet();
      //create Threads
      th1=new Thread(servlet);
      th2=new Thread(servlet);
      th3=new  Thread(servlet);
      
      th1.start();
      th2.start();
      th3.start();
      
       
       
	}
}
