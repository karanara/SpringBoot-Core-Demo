package com.example.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice bowling for few minutes may be 20 or 30 minutes!!";
	}

}
