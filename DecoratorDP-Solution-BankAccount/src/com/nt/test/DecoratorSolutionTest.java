package com.nt.test;

import com.nt.component.BankAccount;
import com.nt.component.CurrentBankAccount;
import com.nt.component.SavingsBankAccount;
import com.nt.decorator.CreditCardDecorator;
import com.nt.decorator.GoldBankAccountDecorator;
import com.nt.decorator.NRIBankAccountDecorator;
import com.nt.decorator.PlatinumBankAccountDecorator;

public class DecoratorSolutionTest {

	public static void main(String[] args) {
		BankAccount account1=null,account2=null,account3=null;
		account1=new NRIBankAccountDecorator(new CreditCardDecorator(new GoldBankAccountDecorator(new SavingsBankAccount())));
		account1.openAccount();
		System.out.println("....................................");
		account2=new CurrentBankAccount();
		account2.openAccount();
		System.out.println("....................................");
		account3=new CreditCardDecorator(new PlatinumBankAccountDecorator(new CurrentBankAccount()));
		account3.openAccount();
	}

}
