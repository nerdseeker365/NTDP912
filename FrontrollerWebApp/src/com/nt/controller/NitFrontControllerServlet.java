package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.command.Command;
import com.nt.command.CommandHelper;
import com.nt.dispatcher.Dispatcher;

@WebServlet("*.do")
public class NitFrontControllerServlet  extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uri=null;
		Command cmd=null;
		String lvn=null;
		RequestDispatcher rd=null;
		try {
		//gather incoming reequest uri
		uri=req.getServletPath();
		//get Command class obj from CommandHelper by giving incoming req uri
		cmd=CommandHelper.mapToCommand(req, uri);
		//call execute method
		lvn=cmd.execute(req, res);
		//forward result page using Dispatcher
		Dispatcher.render(req, res, lvn);
		}
		catch(Exception e) {
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-)
	

}
