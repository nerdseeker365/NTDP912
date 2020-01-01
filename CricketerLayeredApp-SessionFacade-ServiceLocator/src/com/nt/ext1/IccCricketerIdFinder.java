package com.nt.ext1;

import com.nt.dto.CrickterIdDTO;

public interface IccCricketerIdFinder {
	
	public  CrickterIdDTO   fetchIdDetailsByName(String name);

}
