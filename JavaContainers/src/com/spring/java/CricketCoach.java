package com.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	@Autowired
	@Qualifier("happyFortune")
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
				return "Practice fast bowling atleast 15 hours a day";
	}

	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}
	}
