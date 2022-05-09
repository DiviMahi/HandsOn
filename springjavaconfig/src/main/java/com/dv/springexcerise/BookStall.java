package com.dv.springexcerise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.dv.springexcerise" })
public class BookStall {
	@Autowired
	@Qualifier
	Pen pen;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BookStall.class);
		Pen bean = (Pen) context.getBean(Pen.class);

		// bean.write();
		System.out.println(bean);
	}
}
