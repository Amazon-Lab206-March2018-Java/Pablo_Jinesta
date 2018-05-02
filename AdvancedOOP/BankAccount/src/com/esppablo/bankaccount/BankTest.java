package com.esppablo.bankaccount;

public class BankTest {

	public static void main(String[] args) {

		// Load Clients
		BankAccount client1 = new BankAccount();
		BankAccount client2 = new BankAccount();
		BankAccount client3 = new BankAccount();
		BankAccount client4 = new BankAccount();
		BankAccount client5 = new BankAccount();
		
		// Number of Bank Accounts
		System.out.println("Number of Bank Clients: " + BankAccount.numberOfAccounts);
		System.out.println("\n##################\n");

		// Cliente 1
		System.out.println("Client Account ID: " + client1.accountNumber);
		System.out.println("\nAction 1: Deposit $120 to checking account...");
		client1.depositMoney("checking", 120);
		System.out.println("\nAction 2: Deposit $200 to saving account...");
		client1.depositMoney("saving", 200);
		System.out.println("\nAction 3: Deposit $100 to savings account...");
		client1.depositMoney("savings", 100);
		System.out.println("\nAction 4: Withdraw $150 from savings account...");
		client1.withdrawMoney("savings", 150);
		System.out.println();
		client1.totalAccountMoney();

		System.out.println("\n##################\n");
		
		// Client 2
		System.out.println("Client Account ID: " + client2.accountNumber);
		System.out.println("\nAction 1: Deposit $20 to checking account...");
		client2.depositMoney("checking", 20);
		System.out.println("\nAction 2: Deposit $10 to savings account...");
		client2.depositMoney("savings", 10);
		System.out.println();
		client2.totalAccountMoney();
		
		System.out.println("\n##################\n");

		// Client 3
		System.out.println("Client Account ID: " + client3.accountNumber);
		System.out.println();
		client3.totalAccountMoney();
		
		System.out.println("\n##################\n");

		// Client 4
		System.out.println("Client Account ID: " + client4.accountNumber);
		System.out.println();
		client4.totalAccountMoney();
		
		System.out.println("\n##################\n");

		// Client 5
		System.out.println("Client Account ID: " + client5.accountNumber);
		System.out.println();
		client5.totalAccountMoney();
		
		
	}

}
