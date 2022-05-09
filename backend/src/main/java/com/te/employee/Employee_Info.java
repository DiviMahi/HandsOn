package com.te.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee_Info {
	@Id
	private int employee_id;
	@Column(nullable = false)
	private String employee_name;
	@Column(nullable = false)
	private String employee_type;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	public Employee_Info() {
		super();
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_type() {
		return employee_type;
	}
	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee_Info [employee_id=" + employee_id + ", employee_name=" + employee_name + ", employee_type="
				+ employee_type + ", email=" + email + ", password=" + password + "]";
	}

	

}
