package com.dv.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CarConfig {

	@Bean(name = "audi")

	public Car getObj(Engine eng) {
		Car car = new Car();
		car.setBrand("Audi");
		car.setName("Q8");
		car.setPrice(700000);
		car.setEng(eng);
		return car;

	}

	@Bean(name = "lamborgini")
	public Car getOb() {
		Car car = new Car();
		car.setBrand("lamborgini");
		car.setName("g1");
		car.setPrice(67500000);
		// car.setEng(eng);
		return car;

	}

	@Bean(name = "suzuki", autowire = Autowire.BY_NAME)
	public Car getOb2() {
		Car car = new Car();
		car.setBrand("suzuki");
		car.setName("800");
		car.setPrice(6000000);
		// car.setEng(eng);
		return car;

	}

	@Bean(name = "eng")
	public Engine geten() {
		Engine engine = new Engine("e1", "08");
		return engine;
	}

	@Bean(name = "eng5")
	public Engine geten3() {
		Engine engine = new Engine("d1", "065");
		return engine;
	}

	@Primary
	@Bean(name = "eng1")
	public Engine geten1() {
		Engine engine = new Engine("e2", "007");
		return engine;
	}
}