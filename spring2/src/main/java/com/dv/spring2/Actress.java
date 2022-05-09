package com.dv.spring2;

public class Actress {
	private String name;
	private Long phno;
	private String BQuality;
	private Actor actor;

	public Actress() {
		super();
	}

	public Actress(String name, Long phno, String bQuality, Actor actor) {
		super();
		this.name = name;
		this.phno = phno;
		this.BQuality = bQuality;
		this.actor = actor;
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

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	@Override
	public String toString() {
		return "Actress [name=" + name + ", phno=" + phno + ", BQuality=" + BQuality + ", actor=" + actor + "]";
	}

}
