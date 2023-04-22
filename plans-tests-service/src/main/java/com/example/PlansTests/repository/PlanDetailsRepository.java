package com.example.PlansTests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PlansTests.model.PlanDetails;

@Repository
public interface PlanDetailsRepository extends JpaRepository<PlanDetails, Integer> {

}
