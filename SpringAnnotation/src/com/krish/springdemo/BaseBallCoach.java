package com.krish.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {
	
	
	@Autowired
	@Qualifier("sadFotune")
	private FortuneTelling fortuneTelling;
	
	public BaseBallCoach() {
		System.out.println(">> inside the default constructor");
	}
	
//	@Autowired
//	public BaseBallCoach(FortuneTelling fortuneTelling) {
//		this.fortuneTelling = fortuneTelling;
//	}
	
	
	
	@Override
	public String getDailyWorkout() {
		 
		return "Do base ball match learning atleat 1 hr in a day ";
	}



	@Override
	public String getFortuneToday() {
		return fortuneTelling.getFortuneToday();
	}
	
//	@Autowired
//	public void setFortuneservice(FortuneTelling fortuneTelling) {
//		this.fortuneTelling = fortuneTelling;
//	}

}
