package com.dv.springjavaconfig;

import lombok.Data;

@Data
public class Engine{
	private String name;
	private String type;
	
	public Engine(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + "]";
	}
	

}
