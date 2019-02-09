package com.krish.springannot;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "you Will have a bad day today be careful";
	}

}
