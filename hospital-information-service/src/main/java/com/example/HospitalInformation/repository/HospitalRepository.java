package com.example.HospitalInformation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HospitalInformation.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Integer> {
	


}
