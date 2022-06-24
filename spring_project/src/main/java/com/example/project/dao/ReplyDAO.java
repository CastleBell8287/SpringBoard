package com.example.project.dao;

import java.util.List;

import com.example.project.dto.ReplyVo;

public interface ReplyDAO {
	public List<ReplyVo> replyList(String boardId);
	
	public void insertReply(ReplyVo vo);

}
