package com.example.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KabbaddiCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice kabbaddi kabbaddi for 25 mins";
	}

}
