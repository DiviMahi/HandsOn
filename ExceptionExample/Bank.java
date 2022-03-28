package com.dv.ExceptionExample;

public class Bank {
	private int bal;

	public int getBal() {
		return bal;
	}

	public void deposit(int amnt) {
		bal = bal + amnt;
		System.out.println("Balance After Deposit: " + bal);

	}

	public void withdraw(int amnt) {
		if (amnt <= bal && amnt > 0) {
			bal = bal - amnt;
			System.out.println("Balance After Withdraw: " + bal);

		} else {
			try {
				throw new InSufficientBalance("Insufficient Balance");
			} catch (InSufficientBalance e) {
				e.printStackTrace();

			}
		}
	}

}
