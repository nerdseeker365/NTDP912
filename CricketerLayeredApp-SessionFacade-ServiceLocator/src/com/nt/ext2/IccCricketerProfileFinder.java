package com.nt.ext2;

import com.nt.dto.CrickterIdDTO;
import com.nt.dto.CrickterPorfileDTO;

public interface IccCricketerProfileFinder {
	
	public  CrickterPorfileDTO   fetchCrickterById(CrickterIdDTO dto);

}
