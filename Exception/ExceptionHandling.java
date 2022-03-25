package com.dv.Exception;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two values");
		a = s.nextInt();
		b = s.nextInt();
		int r;
		int[] arr;
		try {
			r = a / b;
			arr = new int[r];
			System.out.println(arr[6]);

		} catch (Exception e) {
			if (e instanceof ArithmeticException) {
				System.out.println("Cant divide " + e);
			}
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Invalid Index " + e);

			}
		}
		System.out.println("BYE BYE!!!");

	}

}
