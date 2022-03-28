package com.dv.casting;

public class User {
	String name;
	long num;

	public User(String name, long num) {
		super();
		this.name = name;
		this.num = num;
	}

	public void call() {
		System.out.println(name + "  Is caling...");
	}

	public void msg() {
		System.out.println(name + "  Is messaging...");
	}

}
 