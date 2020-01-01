package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CardInfoDTO implements Serializable {
	private int cardNo;
	private String bankName;
	private int bankCode;
	private  float amount;
	

}
