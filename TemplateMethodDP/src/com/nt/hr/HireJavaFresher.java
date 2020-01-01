package com.nt.hr;

public class HireJavaFresher implements HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireJavaFresher.conductJAVATechnicalTest()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("HireJavaFresher.conductJAVASystemTest()");
		return true;
	}

}
