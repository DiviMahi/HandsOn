package com.dv.projectbank;

public class Child extends Thread {
	Account account;

	public Child(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			account.withDraw(100);
		}

	}
}
