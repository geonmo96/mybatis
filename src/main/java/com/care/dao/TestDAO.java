package com.care.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.care.dto.TestDTO;

@Repository
public class TestDAO {
	@Autowired
	SqlSession sqlSession;
	
	static final String namespace = "com.care.mybatis.myMapper";
	
	public List<TestDTO> test(){
		return sqlSession.selectList(namespace + ".listAll");
	}
	
	public TestDTO list(String num) {
		return sqlSession.selectOne(namespace + ".list", num); 
	}
}
