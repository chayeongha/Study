package com.cyh.study1;

import static org.junit.Assert.*;


import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class sqlSessionTest extends TestabstractCase {

	
	//DB가 잘연동되어있는지 TEST
	
	@Inject
	private DataSource dataSource;
	
	
	//@Test 
	public void dataSourcetest()throws Exception { 
		assertNotNull(dataSource.getConnection());
	}
	 
	
	@Inject
	private SqlSession sqlSession;
	
	
	
	//@Test
	public void sqltest() {
	   assertNotNull(sqlSession);
	}

}
