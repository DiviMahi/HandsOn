package com.dv.rough;

public class B extends A {
	B() {
		super(3);
	}

	B(int a) {
		System.out.println(a);

	}

	public static void add() {
		System.out.println("this is static in class b");

	}

	@Override
	public void greet() {
		System.out.println("this is instance from subclass");
	}

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		A a1=b;
		// a.add();
		// b.add();
		// a.greet();
		// b.greet();
		a1.greet();
		a1.add();

		// System.out.println(A.x);
		// System.out.println(a.y);
		// a.y = 20;
		// A.x = 200;
		// System.out.println(a.y);
		// System.out.println(A.x);
		// System.out.println(a1.y);
		// System.out.println(A.x);
		// A.add();
		// A.add();
		// B.add();
		//

	}
}
