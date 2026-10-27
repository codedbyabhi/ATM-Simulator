package com.atm.service;

import com.atm.model.Account;

public class ATMService {
	private Account account;

	public ATMService(Account acount) {
		this.account = acount;
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: ₹"+account.getBalance());
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			account.deposit(amount);
			System.out.println("Amount deposit successfully")
		}
		else {
			System.out.println("Invalid deposit amount!");
		}
		
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdrawal amount!");
		}
		else if(amount>account.getBalance()) {
			System.out.println("Insufficent balance");
		}
		else {
			account.withdraw(amount);
			System.out.println("Please collect your cash.");
		}
	}
	
	
	

}
