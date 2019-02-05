package com.krish.spring.springcore.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HospMain {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/krish/spring/springcore/list/hospcon.xml");
		Hospital hos = (Hospital)context.getBean("hospital");
		
		System.out.println(hos.getName());
		if(hos.getDepartments().contains("out patient ward")) {
			System.out.println("has out Patient");
		}
	}

}