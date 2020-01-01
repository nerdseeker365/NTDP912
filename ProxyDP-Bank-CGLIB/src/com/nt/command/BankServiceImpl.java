package com.nt.command;

public  class BankServiceImpl  {
	
	public BankServiceImpl() {
		System.out.println("BankServiceImpl:: 0-param constructor");
	}

	
	public static String withdraw(int acno, float amt) {
		return "withdrawing amount :: Rs."+amt+" from the account number::"+acno;
	}

	
	public static String deposite(int acno, float amt) {
		return "depositing amount :: Rs."+amt+" to the account number::"+acno;
	}

}
