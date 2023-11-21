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
	//private Coach thecoach;
	
	//constructor based injection 
	//Qualifier Qualifies which specific bean has to be injected
	
	 @Autowired
	 // We can use Primary annotation to the bean which we want to inject instead of Qualifier . At the end Qualifier has the higher priorit
	public DemoRestController(@Qualifier("swimCoach")Coach mycoach ){

		coach = mycoach;
	}
	 /*public DemoRestController(@Qualifier("cricketCoach")Coach mycoach,@Qualifier("cricketCoach") Coach anothercoach ){
			System.out.println("In Constructor:" +getClass().getSimpleName());

		coach = mycoach;
		thecoach = anothercoach;
	}*/
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
	/*
	@GetMapping("/check")
	public String isCheck() {
		return (coach==thecoach)? "singleton":"prototype";
	}*/

}
    