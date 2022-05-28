package com.q3;

public class Account {
	
	private int accountId;
	private String accountType;
	private int balance;
	
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
	
	public boolean withdraw(int x) {
		if(balance >= x) {
			balance = balance - x;
			System.out.println("Balance amount after withdrawal : "+ this.getBalance());
			return true;
		}
		else {
			System.out.println("Sorry! No Enough Balance");
			return false;
		}
	}

}
