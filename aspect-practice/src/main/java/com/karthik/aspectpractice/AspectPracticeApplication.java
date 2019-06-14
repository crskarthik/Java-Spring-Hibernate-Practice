package com.karthik.aspectpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.karthik.aspectpractice.dao.AccountDAO;

@SpringBootApplication
public class AspectPracticeApplication {

	public static void main(String[] args) {

		ApplicationContext ac = SpringApplication
				.run(AspectPracticeApplication.class, args);
		ac.getBean(AccountDAO.class).addAccount();
		ac.getBean(AccountDAO.class).addAccount();
	}

}
