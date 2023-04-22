package com.example.PlansTests.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.PlansTests.model.TestDetails;

@Service
public interface PlanTestService {
	
	public List<TestDetails> findAllTest();
	
	public void addTest(TestDetails test);
	
	public void editTest(TestDetails test);
	
	public void removeTest(TestDetails test);
	
	public boolean isSessionValid(String token);
	
	public void addData();

}
