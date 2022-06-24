package com.example.project.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.dto.ReplyVo;
import com.example.project.service.BoardService;
import com.example.project.service.ReplyService;

@Controller
public class ReplyController {
@Inject
	ReplyService replyService;
	
	@RequestMapping("reply/list")
	public String replyList(Model model, @RequestParam String boardId) {
		model.addAttribute("boardId",boardId);
		model.addAttribute("list",replyService.replyList(boardId));
		return "redirect:/board/view";
	}
	
	@RequestMapping("reply/insert")
	public String replyInsert(@RequestParam String boardId, Model model, @ModelAttribute ReplyVo vo) {
		model.addAttribute("boardId",boardId);
		replyService.insertReply(vo);
		return "redirect:/board/view";
	}
}
