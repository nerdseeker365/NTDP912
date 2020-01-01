package com.nt.command;

import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

public class CommandHelper {
	private static ResourceBundle bundle=null;
	static {
		//load properties file
		bundle=ResourceBundle.getBundle("com/nt/commons/config");
	}
	
	
	public static  Command   mapToCommand(HttpServletRequest req, String uri) throws Exception{
		Class clazz=null;
		Command cmd=null;
		//get Command class by using incoming request uri
		clazz=Class.forName(bundle.getString(uri));
		//create object for command class
		cmd=(Command) clazz.newInstance();
		return cmd;
	}

}
