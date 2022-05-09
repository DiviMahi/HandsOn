package com.dv.overriding;

public class store {
	public static void main(String[] args) {
		Duster duster = new Duster();
		duster.brake();
		duster.ride();
		Ferrari ferrari = new Ferrari();
		ferrari.ride();

	}

}
