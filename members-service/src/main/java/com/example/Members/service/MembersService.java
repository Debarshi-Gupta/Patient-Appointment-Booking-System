package com.example.Members.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Members.model.MemberDTO;

@Service
public interface MembersService {
	
	public List<MemberDTO> findAllMembers();
	
	public void addMember(MemberDTO memberDTO);
	
	public void editMember(MemberDTO memberDTO);
	
	public void removeMember(MemberDTO memberDTO);
	
	public void addData();

}
