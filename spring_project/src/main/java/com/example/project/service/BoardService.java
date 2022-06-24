package com.example.project.service;

import java.util.List;

import com.example.project.dto.BoardVo;
import com.example.project.dto.ReplyVo;

public interface BoardService {
	public List<BoardVo> boardList();
	
	public List<BoardVo> boardSearch(String search);
	
	public List<ReplyVo> replyList(String boardId);
	
	public void inserBoard(BoardVo vo);
	
	public BoardVo viewBoard(String boardId);
	
	public void deleteBoard(String boardId);
	
	public void updateBoard(BoardVo vo);
}
