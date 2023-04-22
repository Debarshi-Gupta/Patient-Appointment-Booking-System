package com.example.PlansTests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PlansTests.model.PlanTestMapping;

@Repository
public interface PlanTestMappingRepository extends JpaRepository<PlanTestMapping, Integer> {

}
