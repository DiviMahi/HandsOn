package com.dv.springbytype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spr.xml");
		Actor bean = context.getBean("actor", Actor.class);
		System.out.println(bean);
		System.out.println(bean.getAct());
		Actor bean2 = context.getBean("acto", Actor.class);
		System.out.println(bean2);
		System.out.println(bean2.getAct());
	}
}
