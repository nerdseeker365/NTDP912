package com.nt.sessionfacade;

import com.nt.dto.CrickterIdDTO;
import com.nt.dto.CrickterPorfileDTO;
import com.nt.ext1.IccCricketerIdFinder;
import com.nt.ext1.IccCrickterIdFinderImpl;
import com.nt.ext2.IccCricketerProfileFinder;
import com.nt.ext2.IccCrickterProfileFinderImpl;

public class IccCrickterProfileSessionFacadeImpl implements IccCrickterProfileSessionFacade {

	@Override
	public CrickterPorfileDTO delegate(String name) {
		IccCricketerIdFinder   extComp1=null;
		IccCricketerProfileFinder extComp2=null;
		CrickterIdDTO  idDTO=null;
		CrickterPorfileDTO  profileDTO=null;
		//use Ext Comp1
		extComp1=new IccCrickterIdFinderImpl();
		idDTO=extComp1.fetchIdDetailsByName(name);
		//use Ext comp1
		extComp2=new IccCrickterProfileFinderImpl();
		profileDTO=extComp2.fetchCrickterById(idDTO);
		
		return profileDTO;
	}

}
