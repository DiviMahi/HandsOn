package com.dv.ExceptionExample;

public class UnderAgeException extends Exception {
	String msg;

	public UnderAgeException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getmsg() {
		return msg;
	}

}
