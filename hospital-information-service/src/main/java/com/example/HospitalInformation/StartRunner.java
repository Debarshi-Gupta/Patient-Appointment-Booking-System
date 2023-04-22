package com.example.HospitalInformation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.HospitalInformation.service.HospitalInformationServiceImpl;

@Component
public class StartRunner implements ApplicationRunner {
	
	@Autowired
	private HospitalInformationServiceImpl hospitalInformationService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		hospitalInformationService.addData();
	}
	
	

}
