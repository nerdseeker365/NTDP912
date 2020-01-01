package com.nt.ext2;

import com.nt.dto.CrickterIdDTO;
import com.nt.dto.CrickterPorfileDTO;

public class IccCrickterProfileFinderImpl implements IccCricketerProfileFinder {

	@Override
	public CrickterPorfileDTO fetchCrickterById(CrickterIdDTO iDTO) {
		  CrickterPorfileDTO pDTO=null;
		  pDTO=new CrickterPorfileDTO();
		  if(iDTO.getCrickterId()==1001) {
			  pDTO.setCrickterId(1001);
			  pDTO.setCricketerName("sachin Tendulkar");
			  pDTO.setNation("india");
			  pDTO.setState("delhi");
			  pDTO.setTotalIninings(300);
			  pDTO.setTotalRuns(18000);
			  pDTO.setBattingAvg(45.66f);
			  pDTO.setBowlingAvg(10.1f);
			  
		  }
		  else if (iDTO.getCrickterId()==1002) {
			  pDTO.setCrickterId(1002);
			  pDTO.setCricketerName("virt");
			  pDTO.setNation("india");
			  pDTO.setState("mumbai");
			  pDTO.setTotalIninings(100);
			  pDTO.setTotalRuns(200000);
			  pDTO.setBattingAvg(41.66f);
			  pDTO.setBowlingAvg(20.0f);
			  
		  }
		  else if (iDTO.getCrickterId()==1003) {
			  pDTO.setCrickterId(1003);
			  pDTO.setCricketerName("dhoni");
			  pDTO.setNation("india");
			  pDTO.setState("jharkhand");
			  pDTO.setTotalIninings(320);
			  pDTO.setTotalRuns(200000);
			  pDTO.setBattingAvg(56.66f);
			  pDTO.setBowlingAvg(10.0f);
		  }
		  else {
			  throw new IllegalArgumentException("Invlid CRicketer Id");
		  }
		return pDTO;
	}//metod

}//class
