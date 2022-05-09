package com.dv.springjavaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		Car bean = context.getBean("lamborgini", Car.class);
		Car bean2 = context.getBean("audi", Car.class);
		Car bean3 = context.getBean("suzuki", Car.class);

		System.out.println("setter:" + bean);
		System.out.println("by type:" + bean2);
		System.out.println("by name:" + bean3);

	}
}
