package com.nt.decorator;

import com.nt.component.BankAccount;

public class NRIBankAccountDecorator  extends BankAccountDecorator {

	public NRIBankAccountDecorator(BankAccount account) {
		super(account);
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		addForiegnCountryTransactionService();
	}
	
	private  void  addForiegnCountryTransactionService() {
		  System.out.println("Adding  foreign country transaction service");
	}

}
