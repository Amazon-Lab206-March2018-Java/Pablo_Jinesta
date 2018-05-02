package com.esppablo.bankaccount;
import java.util.Random;

// Create a BankAccount class

// We are going to create a BankAccount class. 
// This class will recreate some of the common account transactions that normally occur for a bank 
// account such as displaying your account number, checking and savings amount, total amount. 
// Of course, there are also methods to invoke, such as depositing a check, checking your balance, 
// withdrawing money.

public class BankAccount {
	
	// The class should have the following attributes: 
	// (string) account number, (double) checking balance, (double) savings balance.
	
	public String accountNumber;
	public double checkingBalance;
	public double savingsBalance;
	
	// Create a class member (static) that has the number of accounts created thus far.
	private static int numberOfAccounts = 0;
	
	// Create a class member (static) that tracks the total amount of money stored in every account created.
	private static double totalMoney = 0;
	
	// Create a private method that returns a random ten digit account number.
	private String newAccNum() {
		
		Random randomAccNum = new Random();
		String digits = "0123456789";
		String accountNumber = "";
		
		for(int i = 0; i < 10; i++) {
			int newAccNum = (int)randomAccNum.nextInt(10);
			accountNumber += digits.charAt(newAccNum);
		}
		
		return accountNumber;
		
	}
	
	public BankAccount() {
		// In the constructor, call the private method from above so that each user has a random ten digit account.
		accountNumber = newAccNum();
		checkingBalance = 0;
		savingsBalance = 0;
		// In the constructor, be sure to increment the account count.
		numberOfAccounts++; 
	}
	
	// Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
		return checkingBalance;
	}
    
    // Create a getter method for the user's saving account balance
    public double getSavingsBalance() {
		return savingsBalance;
	}
    
    // Return Accounts Count
    public static int accountsCount() {
        return numberOfAccounts;
    }
    
    // Return Total Bank Account
    public static double moneyCount() {
        return totalMoney;
    }
    
    // Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
	public void depositMoney() {
		
	}
	
	// Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
	public void withdrayMoney() {
		
	}
	
	// Create a method to see the total money from the checking and saving.
	public void totalAccountMoney() {
		System.out.println("Status Checking Account Balance: $" + getCheckingBalance());
		System.out.println("Status Savings Account Balance: $" + getSavingsBalance());
	}
}
;