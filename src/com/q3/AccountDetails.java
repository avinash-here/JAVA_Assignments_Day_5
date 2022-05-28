package com.q3;

import java.util.Scanner;

public class AccountDetails {
	
	public Account getAccountDetails(int id, String type, int bal) {
		Account a1 = new Account();
		a1.setAccountId(id);
		a1.setAccountType(type);
		a1.setBalance(bal);
		
		return a1;		
	}
	
	public int getWithdrawAmount(int x) {
		return 10;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account ID");
		int id = sc.nextInt();
		System.out.println("Enter Account Type");
		String type = sc.next();
		System.out.println("Enter Balance");
		int blnc = sc.nextInt();
		
		
		if(blnc <= 0) {
			boolean valid = true;
			for(int i = 0; valid; i++) {
				System.out.println("Balance should be positive");
				System.out.println("Enter Balance");
				blnc = sc.nextInt();
				if(blnc > 0)
				{ valid = false; }
			}
		}
		
		AccountDetails ad = new AccountDetails();
		Account a1 = ad.getAccountDetails(id,type,blnc);
		
		System.out.println("Enter amount to be Withdrawn");
		int wdrw = sc.nextInt();
		
		
		if(wdrw <= 0) {
			boolean valid = true;
			for(int i = 0; valid; i++) {
				System.out.println("Amount should be positive");
				System.out.println("Enter amount to be Withdrawn");
				wdrw = sc.nextInt();
				if(wdrw > 0)
				{ valid = false; }				
			}
		}		
		
		a1.withdraw(wdrw);		
		
	}

}
