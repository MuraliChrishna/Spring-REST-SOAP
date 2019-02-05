package com.krish.springdemo;

public class BaseBallCoach implements Coach{
	
	//define a private field for the depedency
	private FortuneService fortuneService;
	
	// create a construstor ffor the dependency injection
	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	

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
