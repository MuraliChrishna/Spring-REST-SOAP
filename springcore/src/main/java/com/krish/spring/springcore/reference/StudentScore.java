package com.krish.spring.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentScore {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/krish/spring/springcore/reference/refconf.xml");
		Student stu = (Student) context.getBean("student");
		System.out.println(stu.getScore().getMath());
		
	}

}
