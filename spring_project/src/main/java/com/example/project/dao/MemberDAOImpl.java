package com.example.project.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.project.dto.MemberVo;

@Repository // 데이터 저장을 위한 빈 생성
public class MemberDAOImpl implements MemberDAO {

	@Inject
	
	SqlSession sqlSession;
	
	
	@Override
	public List<MemberVo> memberList() {
		return sqlSession.selectList("member.memberList");
	}

	@Override
	public void insertMember(MemberVo vo) {
		sqlSession.insert("member.insertMember",vo);

	}

	@Override
	public MemberVo viewMember(String userId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("member.viewMember",userId);
	}

	@Override
	public void deleteMember(String userId) {
		sqlSession.delete("member.deleteMember",userId);

	}

	@Override
	public void updateMember(MemberVo vo) {
		sqlSession.update("member.updateMember",vo);

	}

	@Override
	public boolean checkPw(String userId, String userPw) {
			boolean result = false;
			Map<String, String> map = new HashMap<String, String>();
			map.put("userId", userId);
			map.put("userPw", userPw);
			int count = sqlSession.selectOne("member.checkPw",map);
			if(count == 1) {
				result = true;
			}
		return result;
	}
	
	

}
