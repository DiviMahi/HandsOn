package com.dv.defaultstatic;

public interface Test {
	default void msg() {
		System.out.println("Hi...");
	}
}
