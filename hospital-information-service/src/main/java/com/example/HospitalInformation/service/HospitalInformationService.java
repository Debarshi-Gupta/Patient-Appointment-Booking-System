package com.example.HospitalInformation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HospitalInformation.model.Hospital;
import com.example.HospitalInformation.model.HospitalAddress;
import com.example.HospitalInformation.model.HospitalMap;

@Service
public interface HospitalInformationService {
	
	public List<HospitalMap> getAllHospitalInformation();
	
	public void addHospitalInformation(Hospital hospital, HospitalAddress hospitalAddress);
	
	public void changeHospitalInformation(Hospital hospital, HospitalAddress hospitalAddress);
	
	public void removeHospitalInformation(Hospital hospital, HospitalAddress hospitalAddress);
	
	public boolean isSessionValid(String token);
	
	public void addData();

}
