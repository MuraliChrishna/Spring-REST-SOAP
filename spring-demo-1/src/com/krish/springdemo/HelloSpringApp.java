package com.krish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file 
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		

	
		
		// retrieve a bean from spring container 
		/*
		 * Create an object for the interface and use context to get the xml bean from the 
		 * applicationcontext.xml
		 * myCoach is the id for bean 
		 * Coach.class is the interface 
		 */
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		// close the context 
		context.close();
		
	}

}
