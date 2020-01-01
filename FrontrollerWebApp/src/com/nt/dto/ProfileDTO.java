package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ProfileDTO implements Serializable {
	private int  id;
	private  String name;
	private String addrs;
	private  Date dob;
	private String emailId;
	private long mobileNo;

}
