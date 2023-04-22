package com.example.PlansTests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PlansTests.model.TestDetails;

@Repository
public interface TestDetailsRepository extends JpaRepository<TestDetails, Integer> {
	
	public TestDetails findById(int id);

}
