package com.krish.spring.springcore.prop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Countrymain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/krish/spring/springcore/prop/propconf.xml");
		Languages lg = (Languages)context.getBean("languages");
		System.out.println(lg.getCountryAndLangs().get("USA"));
	}

}
