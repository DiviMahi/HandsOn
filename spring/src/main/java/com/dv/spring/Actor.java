package com.dv.spring;

import lombok.Data;

//@Data
public class Actor {
	private String name;
	private Long phno;
	private String BQuality;

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

}
