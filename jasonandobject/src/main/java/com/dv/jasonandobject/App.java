package com.dv.jasonandobject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws JsonProcessingException {
		Employee emp = new Employee(1, "Divya", "hw", 300000);
		Address address = new Address(539, "perya puthur", "CBE", "India");
		emp.setAdd(address);
		ObjectMapper om = new ObjectMapper();
		String asString = om.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
		try {
			om.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("emp.json"), emp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(asString);
	}
} 
