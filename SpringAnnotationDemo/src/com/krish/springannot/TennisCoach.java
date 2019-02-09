package com.krish.springannot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("sadFortuneService")
	private FortuneService fortuneService;
	
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	
	@Override
	public String getDailyWorkout() {
		return "pratcise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	/*
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("insise setter");
		this.fortuneService = fortuneService;
	}
	
	
	@Autowired
	public void doSomeCrayStuff(FortuneService fortuneService) {
		System.out.println("do the shift dance");
		fortuneService =  fortuneService;
	}
	*/
	
	
	

}
