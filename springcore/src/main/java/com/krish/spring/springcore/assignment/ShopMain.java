package com.krish.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopMain {
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/krish/spring/springcore/assignment/shopconf.xml");
		
		ShoppingCart cart = (ShoppingCart) context.getBean("shoppingcart");
	    System.out.println(cart.getItem().getQuantity());
	}

}