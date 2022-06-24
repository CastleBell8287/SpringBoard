package com.example.project.service;

import java.util.List;

import com.example.project.dto.ReplyVo;

public interface ReplyService {
	public List<ReplyVo> replyList(String boardId);
	
	public void insertReply(ReplyVo vo);

	
}
