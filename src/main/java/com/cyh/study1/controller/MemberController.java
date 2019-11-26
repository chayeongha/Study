package com.cyh.study1.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cyh.study1.dao.MemberDAOImpl;
import com.cyh.study1.model.MemberVO;
import com.cyh.study1.service.MemberServiceImpl;

@Controller
@RequestMapping("/member/**")
public class MemberController {

	@Inject
	private MemberServiceImpl memberServiceImpl;
	
	
	//memberjoin
	@GetMapping(value = "memberJoin")
	public void memberJoin() throws Exception{
		
	}
	
	@PostMapping(value ="memberJoin")
	public ModelAndView memberJoin(MemberVO memberVO) throws Exception{
		
		int result= memberServiceImpl.memberJoin(memberVO);
		
		ModelAndView mv= new ModelAndView();
		
		String msg ="회원가입 실패";
		
		if(result==1) {
			mv.setViewName("redirect:../");
			msg="회원가입성공";
			mv.addObject("msg" , msg);
		}

		mv.addObject("msg" , msg);
		mv.addObject("path", "../");
		mv.setViewName("common/common_result");

		return mv;
		
	}
}
