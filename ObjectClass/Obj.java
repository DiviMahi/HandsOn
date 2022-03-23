package com.dv.ObjectClass;

public class Obj {
	// @Override
	// public String toString() {
	// return "ToString method called";

	// }
	public static void main(String[] args) {
		Obj obj = new Obj();
		Obj obj2 = new Obj();
		System.out.println(obj.toString());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.hashCode());
		System.out.println(obj2.getClass());
		obj = null;
		// System.out.println(obj.finalize();
	}

}
