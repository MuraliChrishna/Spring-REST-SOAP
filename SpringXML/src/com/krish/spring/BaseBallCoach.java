package com.krish.spring;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	
public BaseBallCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkOut() {
		return "do daily exercise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
	
	

}
