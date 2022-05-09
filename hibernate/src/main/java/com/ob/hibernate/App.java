package com.ob.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Employee employee = new Employee(1, "Divya", "Devep", 50000);
		EntityManagerFactory cemf = Persistence.createEntityManagerFactory("Employee");
		EntityManager cem = cemf.createEntityManager();
		EntityTransaction transaction = cem.getTransaction();
		cem.persist(employee);
		transaction.begin();
		transaction.commit();

	}
}
