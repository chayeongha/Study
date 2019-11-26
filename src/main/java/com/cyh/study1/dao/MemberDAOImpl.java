package com.cyh.study1.dao;

import javax.inject.Inject;
import javax.xml.stream.events.Namespace;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.cyh.study1.model.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String NAMESPACE ="memberMapper.";
	
	@Override
	public int memberJoin(MemberVO memberVO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"memberJoin", memberVO);
	}

}
