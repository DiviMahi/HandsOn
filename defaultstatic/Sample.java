package com.dv.defaultstatic;

import java.util.LinkedList;

public class Sample implements Test, Demo {

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("Tada Tada Tada...");
		Demo.super.msg();
		Test.super.msg();
	}

}
