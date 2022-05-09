package com.dv.projectbank;

public class Atm {
	public static void main(String[] args) {
		Account account = new Account(100000);
		Parent parent = new Parent(account);
		Child child = new Child(account);
		parent.start();
		child.start();
		try {
			Thread.sleep(1000);
			account.getBalance();
		} catch (Exception e) {
		}

	}
}
