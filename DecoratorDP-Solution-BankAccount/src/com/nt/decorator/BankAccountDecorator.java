//Abstract Decorator
package com.nt.decorator;

import com.nt.component.BankAccount;

public abstract class BankAccountDecorator implements BankAccount {
	private  BankAccount  account;
	
	public BankAccountDecorator(BankAccount account) {
		this.account=account;
	}
	
	@Override
	public void openAccount() {
	    account.openAccount();	
	}
	
	
	

}
