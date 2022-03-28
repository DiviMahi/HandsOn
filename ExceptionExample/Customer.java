package com.dv.ExceptionExample;

import java.util.Scanner;

public class Customer {
	static String name;
	static int age;

	public void getname(String name) {
		System.out.println("Name: " + name);

	}

	public void getage(int age) {
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

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter name");
		name = s.next();
		System.out.println("Enter Age");
		age = s.nextInt();
		Customer obj = new Customer();
		obj.getname(name);
		obj.getage(age);
	

		// License l = new License("Divya", 21);
		// License l1 = new License("Jadhushna", 6);
		// l.getname();
		// l.getage();
		// l1.getname();
		// l1.getage();

	}

}
