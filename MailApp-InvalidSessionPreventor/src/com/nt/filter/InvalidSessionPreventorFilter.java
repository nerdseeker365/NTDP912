package com.nt.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/inboxurl" })
public class InvalidSessionPreventorFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpSession ses=null;
		RequestDispatcher rd=null;
		//get access to the Session 
		ses=((HttpServletRequest)req).getSession(false);
		if(ses!=null && ses.getAttribute("details")!=null)
     		chain.doFilter(req, res);
		else {
			req.setAttribute("errorMsg","Invalid Inbox Access with out login" );
			rd=req.getRequestDispatcher("/login_form.jsp");
			rd.forward(req,res);
		}
			
	}

}
