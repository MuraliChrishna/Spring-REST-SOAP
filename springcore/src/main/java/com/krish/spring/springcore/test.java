package com.krish.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AppCon.xml");
		
		Employee emp =(Employee) context.getBean("employee");
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
	}

}
