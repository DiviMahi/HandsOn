package com.dv.stream;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		Employee o1 = new Employee(1, "Dv", "dev", 100000);
		Employee o2 = new Employee(2, "Aru", "test", 20000);

		Employee o3 = new Employee(3, "Keerthi", "hr", 50000);
		ArrayList<Employee> list = new ArrayList<>();

		list.add(o1);
		list.add(o2);
		list.add(o3);
		Stream<Employee> stream = list.stream();
		Predicate<Employee> filter = (emp) -> {
			return emp.getId() > 2;

		};

		java.util.List<Employee> collect2 = list.stream().filter(emp -> emp.getSalary() > 20000)
				.collect(Collectors.toList());
		System.out.println("Filtered by salary...");
		collect2.forEach(System.out::println);

		Consumer<Employee> c = (emp) -> {
			System.out.println(emp);

		};
		java.util.List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getId))
				.collect(Collectors.toList());
		System.out.println("By comparing id...");
		collect.forEach(c);
		// list.stream()

	}
}
