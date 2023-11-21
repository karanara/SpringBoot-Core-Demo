package com.example.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Lazy
//@Primary
@Component
public class KabbaddiCoach implements Coach {

	/*public KabbaddiCoach() {
		System.out.println("In Constructor:" +getClass().getSimpleName());
	}*/
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practice kabbaddi kabbaddi for 25 mins";
	}

}
