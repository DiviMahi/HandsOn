package com.dv.marshalling;

public class Address {
	String doorNo;
	String street;
	String area;
	int pinCode;
	String Country;

	public Address(String doorNo, String street, String area, int pinCode, String country) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.pinCode = pinCode;
		Country = country;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", pinCode=" + pinCode
				+ ", Country=" + Country + "]";
	}

}
