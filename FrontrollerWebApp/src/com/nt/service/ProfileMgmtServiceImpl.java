package com.nt.service;

import com.nt.bo.ProfileBO;
import com.nt.dao.ProfileDAO;
import com.nt.dao.ProfileDAOImpl;
import com.nt.dto.ProfileDTO;

public class ProfileMgmtServiceImpl implements ProfileMgmtService {
         private  ProfileDAO  dao;
	public ProfileMgmtServiceImpl() {
		dao=new ProfileDAOImpl();
	}
	
	@Override
	public ProfileDTO fetchProfileById(int id) {
		ProfileBO bo=null;
		ProfileDTO dto=null;
		//use DAO
		bo=dao.getProfileById(id);
		//convert bo to dto
		dto=new ProfileDTO();
		dto.setId(bo.getId());
		dto.setName(bo.getName());
		dto.setAddrs(bo.getAddrs());
		dto.setDob(bo.getDob());
		dto.setEmailId(bo.getEmailId());
		dto.setMobileNo(bo.getMobileNo());
		
		return dto;
	}

}
