package com.nt.hr;

public class HirePHPFresher implements HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HirePHPFresher.conductPHPTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("HirePHPFresher.conductPHPSystemTest()");
		return true;
	}

}
