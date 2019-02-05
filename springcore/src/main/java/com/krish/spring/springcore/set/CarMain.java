package com.krish.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/krish/spring/springcore/set/setconf.xml");
		CarDealer car =(CarDealer)context.getBean("carDealer");
		
		System.out.println(car.getMake());
		System.out.println(car.getName());

	}

}
