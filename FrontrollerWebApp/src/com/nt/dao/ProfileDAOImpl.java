package com.nt.dao;

import java.util.Date;

import com.nt.bo.ProfileBO;


public class ProfileDAOImpl implements ProfileDAO {

	@Override
	public ProfileBO getProfileById(int id) {
		ProfileBO bo=null;
		if(id==1) {
			bo=new ProfileBO();
			bo.setId(id);
			bo.setName("raja");
			bo.setAddrs("hyd");
			bo.setDob(new Date(1995,11,23));
			bo.setEmailId("raja@rani.com");
			bo.setMobileNo(9999999999L);
		}
		return bo;	
	}//method
}//class
