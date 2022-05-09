package com.dv.springjavaconfig;

import lombok.Data;

@Data
public class Car {
	private String Name;
	private String brand;
	private double price;
	private Engine eng;

	public Car() {
		super();
	}

	public Car(String name, String brand, double price, Engine eng) {
		super();
		Name = name;
		this.brand = brand;
		this.price = price;
		this.eng = eng;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getEng() {
		return eng;
	}

	public void setEng(Engine eng) {
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Car [Name=" + Name + ", brand=" + brand + ", price=" + price + ", eng=" + eng + "]";
	}

}
