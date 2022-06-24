package com.example.project.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.dto.MemberVo;
import com.example.project.service.LoginService;

@Controller
public class LoginController {
	
	@Inject
	LoginService loginService;
	
	@RequestMapping("login/login")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("login/loginCheck")
	public ModelAndView loginCheck(@ModelAttribute MemberVo vo, HttpSession session) {
		boolean result = loginService.loginCheck(vo, session);
		ModelAndView mav = new ModelAndView();
		if(result==true) {
			mav.addObject("msg","성공");
			mav.setViewName("main");
		}else {
			mav.addObject("msg","실패");
			mav.setViewName("login/login");
		}
		return mav;
	}
	@RequestMapping("login/logout")
	public ModelAndView logout(HttpSession session) {
		loginService.logout(session);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","logout");
		mav.setViewName("login/login");
		return mav;
	}
	
}
