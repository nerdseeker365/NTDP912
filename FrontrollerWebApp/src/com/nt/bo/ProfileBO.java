package com.nt.bo;

import java.util.Date;

import lombok.Data;

@Data
public class ProfileBO {
	private int  id;
	private  String name;
	private String addrs;
	private  Date dob;
	private String emailId;
	private long mobileNo;

}
