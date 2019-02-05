package com.krish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {
	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle.xml");
		
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}
