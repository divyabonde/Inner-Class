package com.java.inner;

public class StaticNestedClass {

	private String bankName;
	
	public StaticNestedClass(String bankName) {
		this.bankName = bankName;
	}
	
	static class Account{
		private String accountNumber;
		private double balance;
		
		public Account(String accountNumber) {
			this.accountNumber = accountNumber;
			this.balance = 0.0;
		}
		
		public void deposit(double amount) {
			balance += amount;
			System.out.println("Deposite $" + amount + " into account " + accountNumber);
		}
		
		public void withdraw(double amount) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdrawn $ " + amount + " from account " + accountNumber);
			} else {
				System.out.println("Insufficient balance in account " + accountNumber);
			}
		}
		
		public void checkBalance() {
			System.out.println("Account " + accountNumber + " balance: $ " + balance);
		}
	}
	public static void main(String[] args) {
		StaticNestedClass bank = new StaticNestedClass("BOI");
		
		StaticNestedClass.Account account1 = new StaticNestedClass.Account("1357");
		account1.deposit(5000);
		account1.withdraw(1500);
		account1.checkBalance();
	}

}
