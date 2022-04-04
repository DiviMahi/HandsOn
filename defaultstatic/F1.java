package com.dv.defaultstatic;

public class F1 {
	public static void main(String[] args) {
		MyFunctionalInterface f = (a, b) -> {
			System.out.println(a * b);

		};
		f.multi(5, 5);
	}

}
