package com.jinhyeon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinhyeon.dao.UserDao;
import com.jinhyeon.domain.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUser(int id) {
		return this.userDao.getUser(id);
	}

}
