package com.example.AdminLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AdminLogin.model.AdminDetails;

@Repository
public interface AdminRepository extends JpaRepository<AdminDetails, Integer> {
	
	public AdminDetails findById(int id);
	
	public AdminDetails findByUsername(String username);

}
