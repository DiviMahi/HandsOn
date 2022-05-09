package com.dv.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Emp {
	@Value(value = "1")
	private int id;
	@Value(value = "DV")
	private String name;

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}
