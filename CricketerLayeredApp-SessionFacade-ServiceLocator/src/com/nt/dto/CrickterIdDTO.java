package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrickterIdDTO implements Serializable {
	private long crickterId;
	private String cricketerName;
	private  String nation;

}
