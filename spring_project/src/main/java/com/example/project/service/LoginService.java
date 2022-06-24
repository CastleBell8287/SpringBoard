package com.example.project.service;

import javax.servlet.http.HttpSession;

import com.example.project.dto.MemberVo;

public interface LoginService {
	public boolean loginCheck(MemberVo vo, HttpSession session);
	
	public MemberVo viewMember(MemberVo vo);
	
	public void logout(HttpSession session);
}
