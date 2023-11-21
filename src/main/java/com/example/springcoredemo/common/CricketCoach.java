package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Component
//default is singleton and specifing prototype
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    
	/*public CricketCoach() {
		System.out.println("In Constructor:" +getClass().getSimpleName());
	}*/
	
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice bowling for few minutes may be 20 or 30 minutes!!";
	}

}
