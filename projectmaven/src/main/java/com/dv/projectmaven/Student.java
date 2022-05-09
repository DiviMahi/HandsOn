package com.dv.projectmaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	private int rollno;
	@Column(name = "Stud_name", nullable = false, length = 25)
	private String name;
	private String dept;

	public Student() {

	}

	public Student(int rollno, String name, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", dept=" + dept + "]";
	}

}
