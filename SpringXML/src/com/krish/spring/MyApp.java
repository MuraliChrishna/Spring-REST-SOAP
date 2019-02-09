package com.krish.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("AppConfig.xml");
		
		
		Coach theCoach = context.getBean("baseBallCoach", Coach.class);
	
		
		
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());

	}

}
