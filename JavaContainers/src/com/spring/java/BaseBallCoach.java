package com.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
	
	@Autowired
	@Qualifier("happyFortune")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Get atleast 30 mins of access to the batting field";
	}

	@Override
	public String getDailyFortune() {
				
		//use my fortune serice to get a fortune 
		return fortuneService.getFortune();
				
	}

}
