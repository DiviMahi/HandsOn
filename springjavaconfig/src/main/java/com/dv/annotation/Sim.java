package com.dv.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Sim {
	@Value(value = "Gio")
	String name;
	@Value(value = "23217")
	String number;

	@Override
	public String toString() {
		return "Sim [name=" + name + ", number=" + number + "]";
	}

}
