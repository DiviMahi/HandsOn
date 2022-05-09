package com.dv.designpattern;

public class Emp {
	/*
	 * static Emp e;
	 * 
	 * private Emp() {
	 * 
	 * }
	 * 
	 * public static Emp getObj() { if (e == null) { e = new Emp(); }
	 * 
	 * return e; }
	 */

	static final Emp e = new Emp();

	Emp() {

	}

	public static Emp getObj() {
		return e;
	}

}
