package com.nt.decorator;

import com.nt.component.BankAccount;

public class SilverBankAccountDecorator extends BankAccountDecorator {

	public SilverBankAccountDecorator(BankAccount account) {
		super(account);
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		addMinBalance();
	}
	
	private  void  addMinBalance() {
		System.out.println("Rs:10000 is min balance ");
	}
	
	

}
