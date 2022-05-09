package com.dv.projectbank;

public class Account {
	double Balance;

	public Account(double balance) {
		super();
		Balance = balance;
	}

	public synchronized void withDraw(int amount) {
		if (amount < Balance) {
			Balance = Balance - amount;

		}
	}

	public void deposit(int amount) {
		Balance = Balance + amount;
	}

	public void getBalance() {
		System.out.println("The Balance is:" + Balance);

	}
}
