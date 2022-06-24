package com.example.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.dao.ReplyDAOImpl;
import com.example.project.dto.ReplyVo;

@Service
public class ReplyServiceImpl implements ReplyService {
	@Inject
	ReplyDAOImpl replyDao;
	@Override
	public List<ReplyVo> replyList(String boardId) {
		// TODO Auto-generated method stub
		return replyDao.replyList(boardId);
	}

	@Override
	public void insertReply(ReplyVo vo) {
		replyDao.insertReply(vo);
	}
	
}
