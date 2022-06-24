package com.example.project.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.dto.BoardVo;
import com.example.project.dto.ReplyVo;
import com.example.project.service.BoardService;
import com.example.project.service.ReplyService;

@Controller
public class BoardController {
	@Inject
	BoardService boardService;
	@Inject
	ReplyService replyService;

	
	@RequestMapping("board/list")
	public String boardList(Model model){
		List<BoardVo> list = boardService.boardList();
		model.addAttribute("list",list);

		return "board/board_list";
	}
	
	@RequestMapping("board/search")
	public String boardSearch(Model model, @RequestParam String search) {
		List<BoardVo> searchList = boardService.boardSearch(search);
		model.addAttribute("searchlist", searchList);
		search = '%'+search+'%';
		System.out.println(searchList + "리스트");
		System.out.println(search + "서치");

		return "board/board_search";
	}
	
	@RequestMapping("board/view")
	public String viewBoard(@RequestParam String boardId, Model model) {
		model.addAttribute("list2",replyService.replyList(boardId));
		model.addAttribute("dto",boardService.viewBoard(boardId));
		System.out.println(boardId + "보드아이디");
		return "board/board_view";
	}
	@RequestMapping("board/insert")
	public String boardInsert(@ModelAttribute BoardVo vo) {
		boardService.inserBoard(vo);
		return "redirect:/board/list";
	}
	
	@RequestMapping("board/write")
	public String boardWrite() {
		return "board/board_write";
	}
	
	@RequestMapping("board/update")
	public String boardUpdate(@ModelAttribute BoardVo vo) {
			boardService.updateBoard(vo);
		
		return "redirect:/board/list";
	}
	@RequestMapping("board/delete")
	public String boardDelete(@RequestParam String boardId) {
			boardService.deleteBoard(boardId);
		return "redirect:/board/list";
	}
}
