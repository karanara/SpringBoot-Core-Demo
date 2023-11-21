package com.example.springcoredemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Component
//default is singleton and specifing prototype
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {
    
	/*public CricketCoach() {
		System.out.println("In Constructor:" +getClass().getSimpleName());
	}*/
	//Bean life cycle methods 
	@PostConstruct
	public void doInitMethod() {
		System.out.println("In DoInitMethod:" +getClass().getSimpleName());
	}
	@PreDestroy
	public void doExitMethod() {
		System.out.println("In DoExitMethod:" +getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice bowling for few minutes may be 20 or 30 minutes!!";
	}

}
