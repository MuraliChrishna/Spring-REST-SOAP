package com.krish.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theCricCoach")
public class CricCoach implements Coach {
	@Autowired
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
