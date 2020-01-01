package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/inboxurl")
public class InBoxServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	         PrintWriter pw=null;
	         //set response content type
	         res.setContentType("text/html");
	         //get PrintWriter
	         pw=res.getWriter();
	         
	         pw.println("<h1 style='color:red;text-align:center'>InBox Page </h1>");
	         
	         pw.println("<br> <a href='signouturl'>SignOut</a>");
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  doGet(req,res);
	}

}
