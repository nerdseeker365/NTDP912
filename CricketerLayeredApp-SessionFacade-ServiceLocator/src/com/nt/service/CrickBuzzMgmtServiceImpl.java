package com.nt.service;

import com.nt.dto.CrickterPorfileDTO;
import com.nt.locator.IccCrickterSessionFacadeLocator;
import com.nt.sessionfacade.IccCrickterProfileSessionFacade;
import com.nt.vo.CrickterPorfileVO;

public class CrickBuzzMgmtServiceImpl implements CrickBuzzProfileMgmtService {

	@Override
	public CrickterPorfileVO fetchCrickterProfile(String name) {
		IccCrickterSessionFacadeLocator locator=null;
		IccCrickterProfileSessionFacade  facade=null;
		CrickterPorfileDTO  profileDTO=null;
		CrickterPorfileVO profileVO=null;
		//get use Service Locator
		locator=IccCrickterSessionFacadeLocator.getInstance();
		//get SessionFacade obj ref
		facade=locator.getSessionFacade("crickterJndi");
		//invoke method
		profileDTO=facade.delegate(name);
		//convert profileDTO to ProfileVO
		profileVO=new CrickterPorfileVO();
		profileVO.setCrickterId(String.valueOf(profileDTO.getCrickterId()));
		profileVO.setCricketerName(profileDTO.getCricketerName());
		profileVO.setNation(profileDTO.getNation());
		profileVO.setState(profileDTO.getState());
		profileVO.setTotalRuns(String.valueOf(profileDTO.getTotalRuns()));
		profileVO.setTotalIninings(String.valueOf(profileDTO.getTotalIninings()));
		profileVO.setBattingAvg(String.valueOf(profileDTO.getBattingAvg()));
		profileVO.setBolwingAvg(String.valueOf(profileDTO.getBowlingAvg()));
		return profileVO;
	}

}
