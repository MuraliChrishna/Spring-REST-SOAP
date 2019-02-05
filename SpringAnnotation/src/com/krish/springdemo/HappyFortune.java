package com.krish.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneTelling {

	
	@Override
	public String getFortuneToday() {
			return "Your day will be very happy";
				
	}

}
