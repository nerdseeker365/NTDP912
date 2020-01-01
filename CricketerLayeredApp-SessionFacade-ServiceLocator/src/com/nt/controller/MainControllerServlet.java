package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.service.CrickBuzzMgmtServiceImpl;
import com.nt.service.CrickBuzzProfileMgmtService;
import com.nt.vo.CrickterPorfileVO;

@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private CrickBuzzProfileMgmtService service=null;
	@Override
	public void init() throws ServletException {
	     service=new CrickBuzzMgmtServiceImpl();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name=null;
		CrickterPorfileVO profileVO=null;
		RequestDispatcher rd=null;
	     //read form data
		name=req.getParameter("name");
		try {
		//use service
		profileVO=service.fetchCrickterProfile(name);
		//keep VO obj in request scope
		req.setAttribute("profile",profileVO);
		//forward to show_details.jsp
		rd=req.getRequestDispatcher("/show_details.jsp");
		rd.forward(req,res);
		}
		catch(IllegalArgumentException iae) {
			rd=req.getRequestDispatcher("/error.jsp");
			rd.forward(req,res);
		}
	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
