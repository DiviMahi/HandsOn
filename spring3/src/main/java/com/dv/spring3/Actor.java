package com.dv.spring3;

public class Actor {
	private String name;
	private String phno;
	private Actress as;

	public Actor() {
		super();
	}

	public Actor(String name, String phno, Actress as) {
		super();
		this.name = name;
		this.phno = phno;
		this.as = as;
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

	public Actress getAs() {
		return as;
	}

	public void setAs(Actress as) {
		this.as = as;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", phno=" + phno + ", as=" + as + "]";
	}

}
