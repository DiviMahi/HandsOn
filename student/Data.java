package com.dv.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Data {
	public static void main(String[] args) {
		Student s = new Student(1, "Divya", "CSE");
		Student s1 = new Student(2, "Keerthi", "TEXTIAL");
		Student s2 = new Student(3, "Arthi", "IT");
		Student s3 = new Student(3, "Arthi", "IT");

		HashSet<Student> hs = new HashSet<>();
		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		hs.add(s);
		hs.add(s3);
		System.out.println(hs);
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		ArrayList<Student> arrayList = new ArrayList<>(hs);
		Collections.sort(arrayList, new SortById());
		for (Student std : arrayList) {
			System.out.println(std);
		}
	}

}
