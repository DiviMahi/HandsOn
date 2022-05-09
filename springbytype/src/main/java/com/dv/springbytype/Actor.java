package com.dv.springbytype;

public class Actor {
	private String name;
	private String phno;
	private Actress act;

	public Actor() {
		super();
	}

	public Actor(String name, String phno, Actress act) {
		super();
		this.name = name;
		this.phno = phno;
		this.act = act;
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

	public Actress getAct() {
		return act;
	}

	public void setAct(Actress act) {
		this.act = act;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", phno=" + phno + "]";
	}

}
