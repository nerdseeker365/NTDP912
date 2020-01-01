package com.nt.decorator;

import com.nt.component.BankAccount;

public class PlatinumBankAccountDecorator extends BankAccountDecorator {

	public PlatinumBankAccountDecorator(BankAccount account) {
		super(account);
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		addMinBalance();
		addPrivelagedBanking();
		addBankingFromHomeService();
	}
	
	private  void  addMinBalance() {
		System.out.println("Rs:30000 is min balance ");
	}
	
	private void  addPrivelagedBanking() {
		System.out.println("adding privleged Banking (Priority Customer) No Quee for Transactions");
	}
	
	private void addBankingFromHomeService() {
		System.out.println("adding Banking from Home service (Employee will come to home)");
	}
}
