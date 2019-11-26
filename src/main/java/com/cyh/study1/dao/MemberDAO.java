package com.cyh.study1.dao;

import com.cyh.study1.model.MemberVO;

public interface MemberDAO {
	
	//join
	public int memberJoin(MemberVO memberVO)throws Exception;
	//들어갔냐안들어갔냐 들어갔으면 1 안들어갔으면 0으로 생각하면되서 리턴값을 int로생각하자.
	
	
	
}
