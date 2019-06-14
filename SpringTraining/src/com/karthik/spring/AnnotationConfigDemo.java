package com.karthik.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfig.class);
//		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getWeeklyWorkout());
		System.out.println(swimCoach.getEmail());
		context.close();
	}

}
