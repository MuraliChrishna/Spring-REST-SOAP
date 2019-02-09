package com.spring.java;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy Ending Today";
	}

}
