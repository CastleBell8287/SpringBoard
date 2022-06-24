package com.example.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.dao.MemberDAOImpl;
import com.example.project.dto.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDAOImpl memberDao;
	@Override
	public List<MemberVo> memberList() {
		// TODO Auto-generated method stub
		return memberDao.memberList();
	}

	@Override
	public void inserMember(MemberVo vo) {
		memberDao.insertMember(vo);

	}

	@Override
	public MemberVo viewMember(String userId) {
		// TODO Auto-generated method stub
		return memberDao.viewMember(userId);
	}

	@Override
	public void deleteMember(String userId) {
		memberDao.deleteMember(userId);

	}

	@Override
	public void updateMember(MemberVo vo) {
		memberDao.updateMember(vo);

	}

	@Override
	public boolean checkPw(String userId, String userPw) {
		// TODO Auto-generated method stub
		return memberDao.checkPw(userId, userPw);
	}
	

}
