package com.spring.java;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
		
	}

	@Override
	public String getDailyWorkout() {
		return "work out doing swim";
		}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
