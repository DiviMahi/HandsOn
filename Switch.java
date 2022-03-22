package com.dv.codingjava;

public class Switch {
	public static void main(String[] args) {
		char name = 'd';
		switch (name) {
		case 'a': {
			System.out.println("name starts with a");
			break;
		}
		case 'b': {
			System.out.println("name starts with b");
			break;
		}
		case 'c': {
			System.out.println("name start with c");
			break;
		}
		case 'd': {
			System.out.println("name start with d");
			break;
		}
		default:
			System.out.println("something else");
		}
		System.out.println("bye bye....");
	}
}

