package com.esppablo.bankaccount;

public class BankTest {

	public static void main(String[] args) {

		// Load Clients
		BankAccount client1 = new BankAccount();
		BankAccount client2 = new BankAccount();
		BankAccount client3 = new BankAccount();
				
		// Number of Bank Accounts
		System.out.println("Number of Bank Accounts: " + BankAccount.numberOfAccounts);
		System.out.println("\n##################\n");

		// Cliente 1
		System.out.println("Client ID: " + client1.accountNumber);
		System.out.println("\nAction 1: Deposit $120 to checking account...");
		client1.depositMoney("checking", 120);
		System.out.println("\nAction 2: Deposit $200 to saving account...");
		client1.depositMoney("saving", 200);
		System.out.println("\nAction 3: Withdraw $190 from savings account...");
		client1.withdrawMoney("savings", 190);
		System.out.println();
		client1.totalAccountMoney();

		System.out.println("\n##################\n");
		
		// Client 2
		System.out.println("Client ID: " + client2.accountNumber);
		System.out.println();
		client2.totalAccountMoney();
		
		System.out.println("\n##################\n");

		// Client 3
		System.out.println("Client ID: " + client3.accountNumber);
		System.out.println();
		client3.totalAccountMoney();
	
	}

}
