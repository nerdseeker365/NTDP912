package com.nt.ext1;

import com.nt.dto.CrickterIdDTO;

public class IccCrickterIdFinderImpl implements IccCricketerIdFinder {

	@Override
	public CrickterIdDTO fetchIdDetailsByName(String name) {
		  CrickterIdDTO  iDTO=null;
		  iDTO=new CrickterIdDTO();
		  if(name.equalsIgnoreCase("sachin")) {
			  iDTO.setCrickterId(1001);
			  iDTO.setCricketerName("sachin Tendulkar");
			  iDTO.setNation("india");
		  }
		  else if(name.equalsIgnoreCase("kohli")) {
			  iDTO.setCrickterId(1002);
			  iDTO.setCricketerName("virat kohli");
			  iDTO.setNation("india");
		  }
		  else if(name.equalsIgnoreCase("dhoni")) {
			  iDTO.setCrickterId(1003);
			  iDTO.setCricketerName("MS Dhoni");
			  iDTO.setNation("india");
		  }
		  else {
			  throw new IllegalArgumentException("Invlid CRicketer name");
		  }
		return iDTO;
	}//metod

}//class
