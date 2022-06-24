package com.example.project.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.project.dto.MemberVo;
@Repository
public class LoginDAOImpl implements LoginDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public boolean loginCheck(MemberVo vo) {
		String name = sqlSession.selectOne("login.loginCheck",vo);
		return (name==null)?false:true;
	}

	@Override
	public MemberVo viewMember(MemberVo vo) {
		return sqlSession.selectOne("login.viewMember",vo);
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub

	}

}
