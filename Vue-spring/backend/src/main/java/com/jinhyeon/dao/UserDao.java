package com.jinhyeon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jinhyeon.domain.User;

@Repository
//@Transactional
public class UserDao {
	public static final String NAMESPACE = "com.jinhyeon.mapper.UserMapper.";

	@Autowired
	private SqlSession sqlSession;
	
	public User getUser(int id) {
		return this.sqlSession.selectOne(NAMESPACE + "getUser", id);
	}

}
