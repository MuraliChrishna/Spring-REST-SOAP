package com.spring.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file 
		
		//ClassPathXmlApplicationContext context = 
		//		new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);

	
		
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
