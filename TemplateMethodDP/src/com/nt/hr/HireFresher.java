package com.nt.hr;

public interface HireFresher {
	
	public default  boolean conductAptitudeTest() {
		System.out.println("HireFresher.conductAptitudeTest()");
		return true;
	}
	public default  boolean conductGroupDiscussionTest() {
		System.out.println("HireFresher.conductGroupDiscussionTest()");
		return true;
	}
	
	public default  boolean conductHRInterview() {
		System.out.println("HireFresher.conductHRInterview()");
		return true;
	}
	
	public   abstract boolean  conductTechnicalTest() ;
	public   abstract boolean  conductSystemTest() ;
	
  //Template method Design Pattern	
	public default  boolean recruitmentProcess() {
		System.out.println("HireFresher.recruitmentProcess()");
		boolean flag=false;
		flag=conductAptitudeTest();
			 if(flag)
				 flag=conductGroupDiscussionTest();
			 if(flag)
				 flag=conductTechnicalTest();
			 if(flag)
				 flag=conductSystemTest();
			 if(flag)
				 flag=conductHRInterview();
		return flag;
	}
}
