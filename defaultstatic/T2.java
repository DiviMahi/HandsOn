package com.dv.defaultstatic;

public class T2 {
	void message() {
		System.out.println("Hello World! from message...");
	}

	static void chat() {
		System.out.println("Hello from chat..");
	}

	public static void main(String[] args) {
		T2 t2 = new T2();
		MyFuncInterface f = t2::message;
		f.msg();
		MyFuncInterface f1 = T2::chat;
		f1.msg();

	}

}
