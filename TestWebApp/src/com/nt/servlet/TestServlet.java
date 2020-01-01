package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/testurl")
public class TestServlet extends HttpServlet implements SingleThreadModel {
	
       
    public TestServlet() {
    	System.out.println("TestServlet.0-param constructor");
    }

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		//get PrintWriter
		pw=res.getWriter();
		res.setContentType("text/html");
		try {
			Thread.sleep(30000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//write response to browser
		pw.println("<h1 style='color:red;text-align:center'>Date and time :: "+new java.util.Date()+"</h1>");
		//close stream
		pw.close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
