package com.example.PlansTests.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.PlansTests.model.AuthResponse;


@FeignClient(name = "admin-login", url = "${ADMIN_LOGIN:http://localhost:8081}")
public interface AuthClient {
	
	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}

