package com.dv.ExceptionExample;

public class InSufficientBalance extends Exception {
	private String msg;

	public InSufficientBalance(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
