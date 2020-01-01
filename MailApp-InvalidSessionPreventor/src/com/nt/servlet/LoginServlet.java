package com.nt.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nt.model.UserDetails;

@WebServlet("/loginurl")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         String user=null,pwd=null;
         UserDetails details=null;
         HttpSession ses=null;
         RequestDispatcher rd=null;
		//read form data
         user=req.getParameter("uname");
         pwd=req.getParameter("pwd");
         //keep them in Model object
         details=new UserDetails();
         details.setUname(user); details.setPwd(pwd);
         //validate username,password
         if(details.getUname().equalsIgnoreCase("raja") && details.getPwd().equalsIgnoreCase("rani")) {
         // keep userDetails in Session
         ses=req.getSession(true);
         ses.setAttribute("details",details);
         //forward to inbox page
         rd=req.getRequestDispatcher("/inboxurl");
         rd.forward(req, res);
         }
         else {
        	 req.setAttribute("errorMsg","Invalid Credentials");
        	//forward to login page
             rd=req.getRequestDispatcher("/login_form.jsp");
             rd.forward(req, res);
         }
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  doGet(req,res);
	}

}
