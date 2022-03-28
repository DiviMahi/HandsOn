package com.dv.ExceptionExample;

public class User extends Bank {
	public static void main(String[] args) {

		Bank b = new Bank();
		System.out.println(b.getBal());

		b.deposit(1000);
		b.withdraw(11000);
		System.out.println(b.getBal());

	}
}
