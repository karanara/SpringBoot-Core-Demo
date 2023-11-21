package com.example.springcoredemo.common;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("In Constructor:  " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice Swim for 45 mins in 3 reps";
	}

}
