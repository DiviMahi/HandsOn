package com.te.employee;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.te.employee.leave.Employee_leave;
import com.te.employee.login.Login1;

public class App {
	public static void main(String[] args) {
		int x = 1;
		Scanner sc = new Scanner(System.in);
		Employee_leave el = new Employee_leave();
		Employee_Info empInf = new Employee_Info();
		Register re = new Register();
		Login1 l = new Login1();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employee_db");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		while (x != 3) {
			System.out.println("Enter your choice 1.Register 2.Login");
			int choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("enter employee id");
					empInf.setEmployee_id(sc.nextInt());
					Employee_Info idconsist = manager.find(Employee_Info.class, empInf.getEmployee_id());
					if (idconsist == null) {
						re.Register(empInf.getEmployee_id());
					} else {
						System.out.println("id already exist");
					}

				} else {
					if (choice == 2) {
						l.login(sc, l, manager, el);
					} else {
						System.out.println("enter valid option");
					}
				}
				System.out.println("enter 3 to exit /n any number to continue");
				x = sc.nextInt();
		
		}

	}
}
