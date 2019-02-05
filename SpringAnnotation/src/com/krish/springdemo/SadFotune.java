package com.krish.springdemo;

import org.springframework.stereotype.Component;


@Component
public class SadFotune implements FortuneTelling {
	
	
	
	@Override
	public String getFortuneToday() {
		// TODO Auto-generated method stub
		return "Sad Day Ahead";
	}

}
