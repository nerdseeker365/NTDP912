package com.nt.component;
// ConcreteCompoment class..
public class SavingsBankAccount implements BankAccount {
	
	public SavingsBankAccount() {
		System.out.println("SavingsBankAccount::0-param constructor");
	}

	@Override
	public void openAccount() {
		System.out.println("SavingsBankAccount::  Opening  savings bankAccount");
	}

}
