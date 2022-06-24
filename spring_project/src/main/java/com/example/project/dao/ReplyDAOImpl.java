package com.example.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.project.dto.ReplyVo;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	@Inject
	SqlSession sqlSession;
	@Override
	public List<ReplyVo> replyList(String boardId) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("reply.replyList",boardId);
	}

	@Override
	public void insertReply(ReplyVo vo) {
		sqlSession.insert("reply.insertReply",vo);

	}
	


}
