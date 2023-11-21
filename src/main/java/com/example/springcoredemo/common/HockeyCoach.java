package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice hockey for 15-30 minsss";
	}

}
