package com.example.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.project.dao.BoardDAO;
import com.example.project.dao.ReplyDAO;
import com.example.project.dto.BoardVo;
import com.example.project.dto.ReplyVo;
@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	BoardDAO boardDao;
	@Inject
	ReplyDAO replyDao;
	@Override
	public List<BoardVo> boardList() {
		// TODO Auto-generated method stub
		return boardDao.boardList();
	}

	@Override
	public List<BoardVo> boardSearch(String search) {
		// TODO Auto-generated method stub
		return boardDao.boardSearch(search);
	}

	@Override
	public List<ReplyVo> replyList(String boardId) {
		// TODO Auto-generated method stub
		return replyDao.replyList(boardId);
	}
	@Override
	public void inserBoard(BoardVo vo) {
		boardDao.inserBoard(vo);

	}

	@Override
	public BoardVo viewBoard(String boardId) {
		// TODO Auto-generated method stub
		return boardDao.viewBoard(boardId);
	}
	@Override
	public void deleteBoard(String boardId) {
		boardDao.deleteBoard(boardId);

	}

	@Override
	public void updateBoard(BoardVo vo) {
		boardDao.updateBoard(vo);

	}

}
