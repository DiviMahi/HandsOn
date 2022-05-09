package com.dv.spring2;

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
		Actress bean = context.getBean("Ak", Actress.class);
		Actress bean2 = context.getBean("As", Actress.class);
		System.out.println(bean);
		System.out.println(bean.getActor());
		System.out.println(bean2);

	}
}
