package com.dv.defaultstatic;

public class lamda {
	public static void main(String[] args) {
		Runnable run = () -> {
			for (int i = 10; i > 0; i--) {
				System.out.println(i);
			}
		};
		Thread thread = new Thread(run);
		thread.start();
	}
}
