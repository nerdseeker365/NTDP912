package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.sdp.Printer;

@WebServlet("/testurl2")
public class TestServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    PrintWriter pw=null;
	    Printer p1=null;
		//get PrintWriter 
	    pw=res.getWriter();
	    res.setContentType("text/html");
	    //write message
	    pw.println("<h1 style='color:red;text-align:center'> TestServlet form WebProj2 </h1>");
	    ///create object for singleton java class...
	    p1=Printer.getInstance();
	    pw.println("<h1 style='color:red;text-align:center'> p1 obj hashCode::"+p1.hashCode()+"</h1>");
	    pw.println("<br>class Loader:"+this.getClass().getClassLoader().getClass().getName());
	    pw.println("<br>class Loader hashCode: "+this.getClass().getClassLoader().hashCode());
	    pw.println("<br> Runtime ::"+Runtime.getRuntime().hashCode());
	    //close stream
	    pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            doGet(req,res);
	}

}
