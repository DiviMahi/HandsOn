package com.dv.rough;

public class A {
	static int x = 20;
	int y = 100;
	B b;

	A() {

		System.out.println("hi");
	}

	A(int b) {
		int y = this.y;
		System.out.println(b);
	}

	public static void add() {
		int add = x + 20;
		System.out.println(add);
		System.out.println("this is static from super");


	}

	public void greet() {
		System.out.println("this is instance from super");
	}
}
