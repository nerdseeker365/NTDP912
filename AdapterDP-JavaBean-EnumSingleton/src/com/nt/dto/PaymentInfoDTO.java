package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PaymentInfoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String[] items;
	private float[] prices;
	private int cardNo;
	private  String bankName;

}
