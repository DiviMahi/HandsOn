package com.dv.Encapsulation;

public class Encap {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setAddress("coimbatore");
		employee.setName("Divya");
		employee.setPhno(797792815);
		System.out.println(employee.getAddress());
		System.out.println(employee.getName());
		System.out.println(employee.getPhno());
	}

}
