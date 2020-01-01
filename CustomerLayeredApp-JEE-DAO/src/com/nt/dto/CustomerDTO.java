package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {
	private String custName;
	private String custAddrs;
	private float pAmt;
	private float rate;
	private float time;

}
