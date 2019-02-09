package com.krish.springannot;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	

	@Override
	public String getDailyFortune() {
		return "You WIll have an ausome day";
	}

}
