package com.nt.command;

public class BankServiceImpl implements BankService {
	
	public BankServiceImpl() {
		System.out.println("BankServiceImpl:: 0-param constructor");
	}

	@Override
	public String withdraw(int acno, float amt) {
		return "withdrawing amount :: Rs."+amt+" from the account number::"+acno;
	}

	@Override
	public String deposite(int acno, float amt) {
		return "depositing amount :: Rs."+amt+" to the account number::"+acno;
	}

}
