package com.krish.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkoutMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Coach myCoach = context.getBean("theCricCoach", Coach.class);
		
		Coach BaseCoach = context.getBean("baseBallCoach", Coach.class);
		
		
		System.out.println(myCoach.getDailyWorkout());
		
		System.out.println(BaseCoach.getDailyWorkout());
		System.out.println(BaseCoach.getFortuneToday());
		
		
		
	}

}
