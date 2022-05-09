package com.dv.jasonandobject;

public class Address {
	int no;
	String street;
	String city;
	String country;

	public Address(int no, String street, String city, String country) {
		super();
		this.no = no;
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [no=" + no + ", street=" + street + ", city=" + city + ", country=" + country + "]";
	}

}
