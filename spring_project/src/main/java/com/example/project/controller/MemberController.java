package com.example.project.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.project.dto.MemberVo;
import com.example.project.service.MemberService;

@Controller
public class MemberController {
	@Inject // 二쇱엯
	MemberService memberService;
	
	//�쉶�썝 紐⑸줉
	
	@RequestMapping("member/list")
	public String memberList(Model model) {
		List<MemberVo> list = memberService.memberList();
		model.addAttribute("list",list);
		return "member/member_list";
	}
	
	@RequestMapping("member/view")
	public String memberView(@RequestParam String userId, Model model) {
		model.addAttribute("dto",memberService.viewMember(userId));
		return "member/member_view";
	}
	
	@RequestMapping("member/write")
	public String memberWrite() {
		return "member/member_write";
	}
	
	@RequestMapping("member/insert")
	public String memberInsert(@ModelAttribute MemberVo vo) {
		memberService.inserMember(vo);
		return "redirect:/member/list";
	}
	@RequestMapping("member/update")
	public String memberUpdate(@ModelAttribute MemberVo vo, Model model) {
		boolean result=memberService.checkPw(vo.getUserId(), vo.getUserPw());
		if(result) {
			memberService.updateMember(vo);
			return "redirect:/member/list";
		} else {
			MemberVo vo2 = memberService.viewMember(vo.getUserId());
			vo.setUserRegDate(vo2.getUserRegDate());
			vo.setUserUpdateDate(vo2.getUserUpdateDate());
			model.addAttribute("dto",vo);
			model.addAttribute("message","불일치");
			return "member/member_view";
		}
	}
	
	@RequestMapping("member/delete")
	public String memberDelete(@RequestParam String userId, @RequestParam String userPw, Model model) {
		boolean result = memberService.checkPw(userId, userPw);
		if(result) {
			memberService.deleteMember(userId);
			return "redirect:/member/list";
		}else {
			model.addAttribute("message","鍮꾨쾲遺덉씪移�");
			model.addAttribute("dto", memberService.viewMember(userId));
			return "member/member_view";
		}
		
	}

}
