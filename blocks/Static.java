package com.dv.blocks;

public class Static {
	static int x=10;
	int y;

	Static(int y) {
		System.out.println("This is constructor"+y);
		this.y=y;
	}

	static {
		System.out.println("this is static block");
		// System.out.println(n.y);

	}
	{
		System.out.println("this is non static block");
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		Static n = new Static(10);
		Static n1 = new Static(20);
		System.out.println(n1.y);
		System.out.println(Static.x);
	}

}
