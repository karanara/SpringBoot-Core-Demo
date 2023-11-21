package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    
	public CricketCoach() {
		System.out.println("In Constructor:" +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice bowling for few minutes may be 20 or 30 minutes!!";
	}

}
