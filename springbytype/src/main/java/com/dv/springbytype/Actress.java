package com.dv.springbytype;

public class Actress {
	private String name;
	private String phno;

	public Actress() {
		super();
	}

	public Actress(String name, String phno) {
		super();
		this.name = name;
		this.phno = phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "Actress [name=" + name + ", phno=" + phno + "]";
	}

}
