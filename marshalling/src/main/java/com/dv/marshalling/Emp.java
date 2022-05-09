package com.dv.marshalling;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Emp {

	int id;
	String name;
	String desg;
	Address ad;
	String password;

	public Emp(int id, String name, String desg, String password) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.password = password;
	}

	public Emp() {
		super();
	}

	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	@XmlAttribute(name = "Emp_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@XmlTransient
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", desg=" + desg + ", password=" + password + "]";
	}

}
