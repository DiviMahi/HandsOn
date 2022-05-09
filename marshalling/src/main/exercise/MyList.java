package com.dv.exercise;

public class MyList {

	Employee emp;

	public MyList() {
		super();
	}

	public MyList(Employee emp) {
		super();
		this.emp = emp;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "MyList [emp=" + emp + "]";
	}

}
