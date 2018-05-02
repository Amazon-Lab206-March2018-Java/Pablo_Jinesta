package com.esppablo.bankaccount;

public class BankTest {

	public static void main(String[] args) {

		BankAccount client1 = new BankAccount();
		BankAccount client2 = new BankAccount();
		BankAccount client3 = new BankAccount();
		
		System.out.println("Client ID: " + client1.accountNumber);
		client1.totalAccountMoney();
		
		System.out.println();
		
		System.out.println("Client ID: " + client2.accountNumber);
		client2.totalAccountMoney();
		
		System.out.println();

		System.out.println("Client ID: " + client3.accountNumber);
		client3.totalAccountMoney();
	
	}

}
