package com.nt.component;
// Concrete Component class

public class CurrentBankAccount implements BankAccount {
	
	public CurrentBankAccount() {
		System.out.println("CurrentBankAccount::0-param constructor");
	}

	@Override
	public void openAccount() {
		System.out.println("CurrentBankAccount::  Opening  current BankAccount");
	}

}
