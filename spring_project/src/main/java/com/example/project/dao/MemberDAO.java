package com.example.project.dao;

import java.util.List;

import com.example.project.dto.MemberVo;

public interface MemberDAO {
	//회원 목록
	public List<MemberVo> memberList();
	
	//회원 입력
	public void insertMember(MemberVo vo);
	
	//회원 정보 상세보기
	public MemberVo viewMember(String userId);
	
	//회원 삭제
	public void deleteMember(String userId);
	
	//회원정보 수정
	public void updateMember(MemberVo vo);
	
	public boolean checkPw(String userId, String userPw);
}
