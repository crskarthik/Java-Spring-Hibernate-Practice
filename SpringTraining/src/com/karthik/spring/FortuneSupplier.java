package com.karthik.spring;

import org.springframework.stereotype.Component;

@Component
public class FortuneSupplier implements Fortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "This method returns fortune from fortune supplier class";
	}

}
