package com.karthik.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	FortuneSupplier fs;
	
	@PostConstruct
	public void init() {
		System.out.println("This method executes first");
	}

	@Override
	public String getDailyWorkout() {
		return "From Tennis coach daily workout";
	}

	@Override
	public String getWeeklyWorkout() {

		return fs.getFortune()+"From Tennis coach weekly workout";
	}
	

	@PreDestroy
	public void end() {
		System.out.println("This method executes last");
	}

}
