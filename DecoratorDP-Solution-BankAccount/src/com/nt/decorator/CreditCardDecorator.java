package com.nt.decorator;

import com.nt.component.BankAccount;

public class CreditCardDecorator extends BankAccountDecorator {

	public CreditCardDecorator(BankAccount account) {
		super(account);
	
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		addCreditCardService();
	}
	
	private   void   addCreditCardService() {
		System.out.println("addingCreditCardService()");
	}

}
