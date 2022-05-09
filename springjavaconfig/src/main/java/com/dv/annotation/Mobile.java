package com.dv.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Mobile {
	@Value(value = "G60")
	String name;
	@Value(value = "Moto")
	String brand;
	@Value(value = "22000")
	double price;
	@Autowired
	Sim sim;

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + ", sim=" + sim + "]";
	}

}
