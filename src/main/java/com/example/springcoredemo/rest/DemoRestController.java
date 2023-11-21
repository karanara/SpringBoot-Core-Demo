package com.example.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcoredemo.common.Coach;

@RestController
public class DemoRestController {
	//define private field for the coach dependency
	//@Autowired
	//field based injection -not recommended
	private Coach coach;
	
	//constructor based injection 
	//Qualifies which specific bean has to be injected
	 @Autowired
	public DemoRestController(@Qualifier("hockeyCoach")Coach mycoach){
		coach = mycoach;
	}
	/*
	   setter based injection using set Method
	 
	@Autowired
	public void setCoach(Coach mycoach) {
		coach = mycoach;
	}*/
	/*
	 * behind the scenes constructor approach
	 * Coach coach = new CricketCoach();
	 * DemoRestController d = new DemoRestController(coach);
	 */
	 /* behind the scenes setter approach
	 * Coach coach = new CricketCoach();
	 * DemoController d = new DemoController();
	 * demoController.setCoach(coach)
	 */
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return coach.getDailyWorkOut();
	}

}
