package com.dv.springbyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// ====NO====
		Actor bean = context.getBean("ac2", Actor.class);
		System.out.println(bean);
		System.out.println(bean.getAct());
		// ===BYName===
		Actor bean1 = context.getBean("ac", Actor.class);
		System.out.println(bean1);
		System.out.println(bean1.getAct());
		Actor bean2 = context.getBean("ac1", Actor.class);
		System.out.println(bean2);
		System.out.println(bean2.getAct());

	}
}
