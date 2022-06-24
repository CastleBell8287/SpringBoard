package com.example.project.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.example.project.dao.LoginDAO;
import com.example.project.dto.MemberVo;

@Service
public class LoginServiceImpl implements LoginService {
	@Inject
	LoginDAO loginDao;
	@Override
	public boolean loginCheck(MemberVo vo, HttpSession session) {
		boolean result = loginDao.loginCheck(vo);
		if(result) {
			MemberVo vo2 = viewMember(vo);
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
		}
		return result;
		
	}

	@Override
	public MemberVo viewMember(MemberVo vo) {
		return loginDao.viewMember(vo);
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();

	}

}
