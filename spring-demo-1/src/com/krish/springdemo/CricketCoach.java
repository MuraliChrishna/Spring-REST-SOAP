package com.krish.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg Constructor");
	}

	@Override
	public String getDailyWorkout() {
				return "Practice fast bowling atleast 15 hours a day";
	}

	@Override
	public String getDailyFortune() {
				return fortuneService.getFortune();
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method");

		this.fortuneService = fortuneService;
		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	

}
