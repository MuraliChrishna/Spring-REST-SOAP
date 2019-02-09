package com.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.java")
public class SportConfig {
	
	@Bean
	public FortuneService happyFortune() {
		return new HappyFortune();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(happyFortune());
	}
	

}
