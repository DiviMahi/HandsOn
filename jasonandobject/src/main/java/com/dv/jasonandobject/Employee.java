package com.dv.jasonandobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	@JsonProperty(value = "Emp_id")
	int id;
	String name;
	String desg;
	@JsonIgnore
	double sal;
	Address add;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String desg, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.sal = sal;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
	}

}
