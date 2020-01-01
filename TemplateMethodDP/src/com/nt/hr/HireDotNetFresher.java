package com.nt.hr;

public class HireDotNetFresher implements HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("HireDotNetFresher.conduct.NETTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("HireDotNetFresher.conduct.NETSystemTest()");
		return true;
	}

}
