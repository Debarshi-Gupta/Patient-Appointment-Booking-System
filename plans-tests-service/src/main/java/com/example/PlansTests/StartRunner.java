package com.example.PlansTests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.PlansTests.service.PlanTestServiceImpl;

@Component
public class StartRunner implements ApplicationRunner {
	
	@Autowired
	private PlanTestServiceImpl planTestServiceImpl;
	
	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		planTestServiceImpl.addData();
	}

}
