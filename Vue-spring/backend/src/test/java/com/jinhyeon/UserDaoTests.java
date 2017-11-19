package com.jinhyeon;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jinhyeon.dao.UserDao;
import com.jinhyeon.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UserDaoTests {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void test() {
		User user = this.userDao.getUser(1);
		
		assertEquals(user.getId(), 1);
		assertEquals(user.getUserName(), "박진현");
	}
}
