package com.example.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	//define private feild for the coach dependency
	private Coach coach;
	@Autowired
	public DemoRestController(Coach mycoach){
		coach = mycoach;
	}
	/*
	 * behind the scenes
	 * Coach coach = new CricketCoach();
	 * DemoRestController d = new DemoRestController(coach);
	 */
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return coach.getDailyWorkOut();
	}

}