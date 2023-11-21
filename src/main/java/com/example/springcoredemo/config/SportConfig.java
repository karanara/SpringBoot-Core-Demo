package com.example.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.springcoredemo.common.Coach;
import com.example.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	@Bean
	// use case-- takes third party class and exposes as spring bean
	public Coach swimCoach() {
		return new SwimCoach();
	}
}
