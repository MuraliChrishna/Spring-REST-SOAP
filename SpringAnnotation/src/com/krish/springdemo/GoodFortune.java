package com.krish.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GoodFortune implements FortuneTelling {

	@Override
	public String getFortuneToday() {
		
		return "Good Day Ahead";
	}

}
