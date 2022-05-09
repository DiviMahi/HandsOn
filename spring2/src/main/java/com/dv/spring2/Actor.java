package com.dv.spring2;

public class Actor {
	private String name;
	private Long phno;
	private String BQuality;

	public Actor() {
		super();
	}

	public Actor(String name, Long phno, String bQuality) {
		super();
		this.name = name;
		this.phno = phno;
		this.BQuality = bQuality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getBQuality() {
		return BQuality;
	}

	public void setBQuality(String bQuality) {
		BQuality = bQuality;
	}

	@Override
	public String toString() {
		return "Actor [name=" + name + ", phno=" + phno + ", BQuality=" + BQuality + "]";
	}

}
