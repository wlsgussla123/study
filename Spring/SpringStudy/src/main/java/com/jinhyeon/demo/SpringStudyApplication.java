package com.jinhyeon.demo;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jinhyeon.demo.dao.UserDao;
import com.jinhyeon.demo.domain.User;

@SpringBootApplication
public class SpringStudyApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		SpringApplication.run(SpringStudyApplication.class, args);
		UserDao dao = new UserDao();
		
		User user = new User();
		user.setId("1");
		user.setName("박진현");
		user.setPassword("1234");
		
		dao.add(user);
		
		System.out.println(user.getId() + "등록 성공");
	}
}
