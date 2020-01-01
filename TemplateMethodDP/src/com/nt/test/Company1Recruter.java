package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.hr.HireFresher;

public class Company1Recruter {

	public static void main(String[] args) {
		HireFresher fresher=null;
		fresher=HireFresherFactory.getInstance("java");
		fresher.recruitmentProcess();
	}
}
