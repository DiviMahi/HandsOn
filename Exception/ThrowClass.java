package com.dv.Exception;

public class ThrowClass {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println("Cant divide "+e);
		}
		System.out.println("BYE BYE...");

	}

} 
