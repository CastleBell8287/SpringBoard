package com.example.project.dao;

import java.util.List;

import com.example.project.dto.BoardVo;
import com.example.project.dto.ReplyVo;

public interface BoardDAO {
	public List<ReplyVo> replyList(String boardId);
	
	public List<BoardVo> boardSearch(String search);
	
	public List<BoardVo> boardList();
	
	public void inserBoard(BoardVo vo);
	
	public BoardVo viewBoard(String boardId);
	
	public void deleteBoard(String boardId);
	
	public void updateBoard(BoardVo vo);
}
