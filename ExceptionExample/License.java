package com.dv.ExceptionExample;

public class License {
	private String name;
	private int age;

	public License(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void getname() {
		System.out.println("Name: " + name);

	}

	public void getage() {
		if (age > 18) {
			System.out.println("Age: " + age);

		} else {
			try {
				throw new UnderAgeException("Under age");
			} catch (UnderAgeException e) {
				System.out.println(e.getmsg());

			}
		}
	}
}
