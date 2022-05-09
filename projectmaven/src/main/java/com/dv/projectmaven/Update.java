package com.dv.projectmaven;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory cemf = Persistence.createEntityManagerFactory("Student");
		EntityManager em = cemf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Student find = em.find(Student.class, 1);
		System.out.println(find);
		find.setDept("Mech");
		em.persist(find);
		transaction.begin();
		transaction.commit();
		System.out.println(find);

	}

}
