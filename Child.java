package com.dv.project;

public class Child extends Parent {
	int c;
	int d;
	int f;
	int g;
	int h;

	public Child(int a, int b, int c, int d, int f) {
		super(a, b);
		System.out.println("from -->5");
		this.c = c;
		this.d = d;
		this.f = f;
	}

	public Child(int a, int b, int c, int d, int f, int g, int h) {
		this(a, b, c, d, f);
		System.out.println("from -->7");
		this.g = g;
		this.h = h;
		
	}

}
