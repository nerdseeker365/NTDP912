package com.nt.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dto.ProfileDTO;
import com.nt.service.ProfileMgmtService;
import com.nt.service.ProfileMgmtServiceImpl;

public class ProfileCommand implements Command {
	 private ProfileMgmtService  service;
	 
	public ProfileCommand() {
		service=new ProfileMgmtServiceImpl();
	}

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		ProfileDTO dto=null;
		//use service
		dto=service.fetchProfileById(Integer.parseInt(req.getParameter("id")));
		//keep dto in request scope
		req.setAttribute("profileInfo", dto);
		//return logical view name
		return "show_profile";
	}

}
