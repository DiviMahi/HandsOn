package com.dv.defaultstatic;

import java.util.ArrayList;
import java.util.LinkedList;

public interface Demo {
	default void msg() {
		System.out.println("Hello...");
	}

}
