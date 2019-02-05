package com.krish.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run atleast 8 hours in a day";
	}

	@Override
	public String getDailyFortune() {
				return "Lets do it: " +fortuneService.getFortune();
	}

	//add an init method
	
	public void doMyStartUpStuff() {
		System.out.println("do my startup stuff");
	}
	
	
	// add a destroy method
	
	public void doMyCleanUpStuff() {
		System.out.println("do the cleanup");
	}
}
