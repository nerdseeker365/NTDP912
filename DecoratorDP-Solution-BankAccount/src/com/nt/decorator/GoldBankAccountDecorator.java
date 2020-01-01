package com.nt.decorator;

import com.nt.component.BankAccount;

public class GoldBankAccountDecorator extends BankAccountDecorator {

	public GoldBankAccountDecorator(BankAccount account) {
		super(account);
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		addMinBalance();
		addPrivilegedBanking();
	}
	
	private  void  addMinBalance() {
		System.out.println("Rs:20000 is min balance ");
	}
	private  void   addPrivilegedBanking() {
		System.out.println("adding privleged Banking (Priority Customer) No Quee for Transactions");
	}
	
	

}
