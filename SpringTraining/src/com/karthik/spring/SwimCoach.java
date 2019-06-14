package com.karthik.spring;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private Fortune fs;
	
	@Value("${user.email}")
	private String email;
	
	public SwimCoach(Fortune fs) {
		this.fs = fs;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getWeeklyWorkout() {
		// TODO Auto-generated method stub
		return "Swim in party pool during weekend and "+fs.getFortune();
	}
	
	public String getEmail() {
		return this.email;
	}

}
