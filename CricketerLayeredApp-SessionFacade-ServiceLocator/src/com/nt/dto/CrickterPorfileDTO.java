package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CrickterPorfileDTO implements Serializable {
	private long crickterId;
	private String cricketerName;
	private  String nation;
	private String  state;
	private long totalRuns;
	private  long totalIninings;
	private float battingAvg;
	private float bowlingAvg;

}
