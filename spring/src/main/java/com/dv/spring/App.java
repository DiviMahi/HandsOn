package com.dv.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sprig.xml");
		Actor bean = context.getBean(Actor.class);
		System.out.println(bean.getBQuality());
		System.out.println(bean);
	}
}
