package com.dv.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Employee emp = new Employee(1, "Divya", 10000);
		Employee emp2 = new Employee(3, "Arthi", 10000);
		Employee emp1 = new Employee(2, "Keerthi", 10000);
		ArrayList<Employee> l = new ArrayList<>();
		l.add(emp);
		l.add(emp2);
		l.add(emp1);
		// ===using for loop===
		// for (int i = 0; i < l.size(); i++) {
		// System.out.println(l.get(i));
		// }
		// System.out.println();
		// ===using for each===
		// for (Employee e : l) {
		// System.out.println(e);
		// }
		// System.out.println();
		System.out.println("Type id ,if u want to sort based on id...");
		System.out.println("Type name, if u want to sort based on name...");
		String S = s.next();
		switch (S) {
		case "id":
			SortById sortById = new SortById();
			Collections.sort(l, sortById);
			break;
		case "name":
			SortByName sortByName = new SortByName();
			Collections.sort(l, sortByName);
			break;
		default:
			System.out.println("Enter the type correctly...");

		}
		// SortById sortById = new SortById();

		// Collections.sort(l, sortByName);
		// Collections.sort(l, sortById);

		System.out.println();
		Iterator<Employee> it = l.iterator();
		System.out.println();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}
