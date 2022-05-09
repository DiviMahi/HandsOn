package com.dv.projectmaven;

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
		Student student = new Student();
		student.setDept("cse");
		student.setName("Divya");
		student.setRollno(1);
		Student student1 = new Student(2, "Abisekha", "IT");
		EntityManagerFactory cemf = Persistence.createEntityManagerFactory("Student");
		EntityManager em = cemf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		em.persist(student);
		em.persist(student1);

		// ===Fetching Data from DB===
		Student find = em.find(Student.class, 1);
		System.out.println(find);
		Student reference = em.getReference(Student.class, 2);
		System.out.println("This is Ref=>" + reference);

		// ===Merging Data to container===
		Student merge = em.merge(student);
		Student merge2 = em.merge(student1);
		
		//===Updating Values===
		find.setDept("Mech");
		em.persist(find);
		

		// ===Removing data in DB===
		em.remove(merge2);
		transaction.begin();
		transaction.commit();
		System.out.println(find);


	}

}
