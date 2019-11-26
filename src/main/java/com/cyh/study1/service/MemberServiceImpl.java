package com.cyh.study1.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cyh.study1.dao.MemberDAOImpl;
import com.cyh.study1.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDAOImpl memberDAOImpl;
	
	@Override
	public int memberJoin(MemberVO memberVO) throws Exception {
		// TODO Auto-generated method stub
		return memberDAOImpl.memberJoin(memberVO);
	}

}
