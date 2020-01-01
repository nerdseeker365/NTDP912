package com.nt.dispatcher;

import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher {
	private static ResourceBundle bundle;
	
	static {
		bundle=ResourceBundle.getBundle("com/nt/commons/config");
	}
	
	public static void  render(HttpServletRequest req,HttpServletResponse res,String viewName) throws Exception {
		String page=null;
		RequestDispatcher rd=null;
		//get Result jsp page from properties file by using logical view name
		page=bundle.getString(viewName);
		//forward result page
		rd=req.getRequestDispatcher(page);
		rd.forward(req,res);
	}

}
