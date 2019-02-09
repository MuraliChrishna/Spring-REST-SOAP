package com.krish.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortune")
	private FortuneTelling fortuneTelling; 
	
	
//	public CricCoach(FortuneTelling fortuneTelling) {
//		this.fortuneTelling = fortuneTelling;
//	}
	@Override
	public String getDailyWorkout() {
		return "Practise workout atleast once for a day";
	}

	@Override
	public String getFortuneToday() {
		return fortuneTelling.getFortuneToday();
	}

}
