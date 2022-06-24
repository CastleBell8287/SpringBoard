package com.example.project.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.project.dto.BoardVo;
import com.example.project.dto.ReplyVo;
@Repository
public class BoardDAOImpl implements BoardDAO {
@Inject
SqlSession sqlSession;
	@Override
	public List<BoardVo> boardList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.boardList");
	}

	
	
	@Override
	public List<BoardVo> boardSearch(String search) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.boardSearch",search);
	}



	@Override
	public List<ReplyVo> replyList(String boardId) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("reply.replyList",boardId);
	}
	@Override
	public void inserBoard(BoardVo vo) {
		sqlSession.insert("board.insertBoard",vo);

	}

	@Override
	public BoardVo viewBoard(String boardId) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.viewBoard",boardId);
	}

	@Override
	public void deleteBoard(String boardId) {
		sqlSession.delete("board.deleteBoard",boardId);

	}

	@Override
	public void updateBoard(BoardVo vo) {
		sqlSession.update("board.updateBoard",vo);

	}

}
